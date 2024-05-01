class Library {
    private java.util.Map<String, Book> books;

    public Library() {
        books = new java.util.HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public java.util.List<Book> searchBooks(String query) {
        java.util.List<Book> result = new java.util.ArrayList<>();
        for (Book book : books.values()) {
            if (book.getTitle().equalsIgnoreCase(query) || book.getAuthor().equalsIgnoreCase(query)) {
                result.add(book);
            }
        }
        return result;
    }

    public Book getBook(String title) {
        return books.get(title);
    }

    public void updateBook(String title, Book newBook) {
        if (books.containsKey(title)) {
            books.put(title, newBook);
        }
    }
}