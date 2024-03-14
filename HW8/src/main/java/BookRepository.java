import java.util.List;
public interface BookRepository {
    List<Book> getAllBooks();
    Book getBookById(int id);
}