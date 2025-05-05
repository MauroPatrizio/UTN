const express = require("express");
const router = express.Router();
const Book = require("../models/book.model");

// Middleware
const getBook = async (req, res, next) => {
	let book;
	const { id } = req.params;

	if (!id.match(/^[0-9a-fA-F]{24}$/)) {
		return res.status(400).json({ message: "El id del libro no es valido" });
	}

	try {
		book = await Book.findById(id);
		if (!book) {
			return res.status(404).json({ message: "No se encontro el libro" });
		}
	} catch (err) {
		return res.status(500).json({ message: err.message });
	}

	res.book = book;
	next();
};

// Get all books
router.get("/", async (req, res) => {
	try {
		const books = await Book.find();
		console.log("GET ALL", books);
		if (books.length === 0) {
			return res.status(204).json([]);
		}
		res.json(books);
	} catch (err) {
		res.status(500).json({ message: err.message });
	}
});

// Create a new book
router.post("/", async (req, res) => {
	const { title, author, genre, publishedDate } = req.body;
	if (!title || !author || !genre || !publishedDate) {
		return res
			.status(400)
			.json({ message: "Los campos titulo, autor, genero y fecha son obligatorios" });
	}
	const book = new Book({
		title,
		author,
		genre,
		publishedDate,
	});

	try {
		const newBook = await book.save();
		console.log("POST", newBook);
		res.status(201).json(newBook);
	} catch (err) {
		res.status(400).json({ message: err.message });
	}
});

// Get a book by id
router.get("/:id", getBook, async (req, res) => {
	res.json(res.book);
});

// Update a book by id
router.put("/:id", getBook, async (req, res) => {
	try {
		const book = res.book;
		book.title = req.body.title || book.title;
		book.author = req.body.author || book.author;
		book.genre = req.body.genre || book.genre;
		book.publishedDate = req.body.publishedDate || book.publishedDate;

		const updatedBook = await book.save();
		res.json(updatedBook);
	} catch (error) {
		res.status(400).json({ message: error.message });
	}
});

// Delete a book by id
router.delete("/:id", getBook, async (req, res) => {
	try {
		const book = res.book;
		await book.deleteOne({
			_id: book._id,
		});
		res.json({ message: `El libro '${book.title}' fue eliminado` });
	} catch (error) {
		res.status(500).json({ message: error.message });
	}
});

module.exports = router;
