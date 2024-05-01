import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LibraryManagementSystemFrame extends JFrame {
    private Library library;
    private JTextField titleField, authorField, genreField, searchField;
    private JTextArea outputArea;

    public LibraryManagementSystemFrame() {
        initializeLibrary();
        setTitle("Library Management System");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        createComponents();
        setVisible(true);
    }

    private void initializeLibrary() {
        library = new Library();
    }

    private void createComponents() {
        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Title:"));
        titleField = new JTextField();
        inputPanel.add(titleField);
        inputPanel.add(new JLabel("Author:"));
        authorField = new JTextField();
        inputPanel.add(authorField);
        inputPanel.add(new JLabel("Genre:"));
        genreField = new JTextField();
        inputPanel.add(genreField);

        JButton addButton = new JButton("Add Book");
        addButton.addActionListener(new AddBookListener());
        inputPanel.add(addButton);

        inputPanel.add(new JLabel("Search:"));
        searchField = new JTextField();
        inputPanel.add(searchField);

        JButton searchButton = new JButton("Search Book");
        searchButton.addActionListener(new SearchBookListener());
        inputPanel.add(searchButton);

        add(inputPanel, BorderLayout.NORTH);

        outputArea = new JTextArea();
        add(new JScrollPane(outputArea), BorderLayout.CENTER);
    }

    private void clearFields() {
        titleField.setText("");
        authorField.setText("");
        genreField.setText("");
    }

    private class AddBookListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String title = titleField.getText().trim();
            String author = authorField.getText().trim();
            String genre = genreField.getText().trim();

            if (!title.isEmpty() && !author.isEmpty() && !genre.isEmpty()) {
                Book book = new Book(title, author, genre);
                library.addBook(book);
                outputArea.append("Book added successfully.\n");
                clearFields(); // Clear input fields after adding a book
            } else {
                outputArea.append("Please fill in all fields.\n");
            }
        }
    }

    private class SearchBookListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String query = searchField.getText().trim();

            if (!query.isEmpty()) {
                outputArea.setText("");
                for (Book book : library.searchBooks(query)) {
                    outputArea.append(book.toString() + "\n");
                }
                if (outputArea.getText().isEmpty()) {
                    outputArea.append("No matching books found.\n");
                }
            } else {
                outputArea.setText("");
                outputArea.append("Please enter search query.\n");
            }
        }
    }
}
