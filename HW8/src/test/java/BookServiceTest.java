
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {
    @Mock
    private BookRepository bookRepository;

    @Test
    public void testGetAllBooks() {
        List<Book> expectedBooks = Arrays.asList(
                new Book(1, "Book 1", "Author 1"),
                new Book(2, "Book 2", "Author 2")
        );

        when(bookRepository.getAllBooks()).thenReturn(expectedBooks);

        BookService bookService = new BookService(bookRepository);

        List<Book> actualBooks = bookService.getAllBooks();

        assertEquals(expectedBooks, actualBooks);
    }

    @Test
    public void testGetBookById() {
        Book expectedBook = new Book(1, "Book 1", "Author 1");

        when(bookRepository.getBookById(1)).thenReturn(expectedBook);

        BookService bookService = new BookService(bookRepository);

        Book actualBook = bookService.getBookById(1);

        assertEquals(expectedBook, actualBook);
    }
}
