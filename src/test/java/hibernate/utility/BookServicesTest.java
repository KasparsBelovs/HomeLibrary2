package hibernate.utility;

import hibernate.entities.Book;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookServicesTest {
    private BookServices bookServices = new BookServices();

    @Test
    void getBookById(){
        Book book = bookServices.getBookById(3);
        assertEquals("MyBook", book.getNameBooks());
    }

    @Test
    void createBookTest(){
        List booksListBefore = bookServices.getAllBooks();
        bookServices.createBook("MyBook","KB",2020,100);
        List booksListAfterAdd = bookServices.getAllBooks();
        assertEquals(booksListAfterAdd.size(), booksListBefore.size() +1);
    }

    @Test
    void getAllBooks() {
        List<Book> booklist = bookServices.getAllBooks();
        assertTrue(booklist.size()>0);
    }

    @Test
    void deleteBook(){
        List<Book> booksListBefore = bookServices.getAllBooks();
        bookServices.deleteBook(5);
        List booksListAfterAdd = bookServices.getAllBooks();
        assertEquals(booksListAfterAdd.size(), booksListBefore.size() -1);
    }

}
