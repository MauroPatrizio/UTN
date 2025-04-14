require("dotenv").config();
const express = require("express");
const mongoose = require("mongoose");
const bodyParser = require("body-parser");

const app = express();

app.use(bodyParser.json());

mongoose
	.connect(`mongodb://${process.env.MONGO_USER}:${process.env.MONGO_PASS}@localhost:27017`, {
		useNewUrlParser: true,
		useUnifiedTopology: true,
	})
	.then(() => console.log("conexion exitosa "))
	.catch((err) => console.log("error de conexion", err));

const esquema = new mongoose.Schema({
	nombre: String,
	edad: Number,
	email: String,
});

const Usuario = mongoose.model("Usuario", esquema);

app.get("/usuarios", async (req, res) => {
	try {
		const usuarios = await Usuario.find();
		res.json(usuarios);
	} catch (error) {
		console.log(error);
		res.status(500).send("Error al obtener los usuarios");
	}
});

app.post("/usuarios", async (req, res) => {
	try {
		const usuario = new Usuario(req.body);
		await usuario.save();
		res.status(201).json(usuario);
	} catch (error) {
		console.log(error);
		res.status(500).send("Error al crear el usuario");
	}
});

app.listen(process.env.PORT, () => {
	console.log(`Corriendo el servidor en el puerto ${process.env.PORT}`);
});
