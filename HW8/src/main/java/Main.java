import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepositoryImpl(); // создание экземпляра BookRepositoryImpl
        BookService bookService = new BookService(bookRepository); // создание экземпляра BookService

        List<Book> allBooks = bookService.getAllBooks();
        System.out.println("All Books:");
        for (Book book : allBooks) {
            System.out.println(book.getTitle() + " - " + book.getAuthor());
        }

        int bookId = 1;
        Book bookById = bookService.getBookById(bookId);
        if (bookById != null) {
            System.out.println("\nBook with ID " + bookId + ":");
            System.out.println(bookById.getTitle() + " - " + bookById.getAuthor());
        } else {
            System.out.println("\nBook with ID " + bookId + " not found.");
        }
    }
}