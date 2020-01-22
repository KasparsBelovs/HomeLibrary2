package hibernate.utility;

import hibernate.entities.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BookServices {

    public BookServices(){}

    public Book getBookById(int id) {
            Session session = DBConfig.getSessionFactory().openSession();
           Book book = session.get(Book.class, id);
            session.close();
        return book;
    }

    public Book createBook(String name,String author,int year,int pageCount) {
        Book book = new Book();
        Transaction transaction = null;
        try {
            Session session = DBConfig.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            book.setNameBooks(name);
            book.setAuthorBooks(author);
            book.setYearBooks(year);
            book.setPageCountBooks(pageCount);
            session.save(book);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return book;
    }

    public List<Book> getAllBooks(){
        List<Book> allBooks;
        Session session = DBConfig.getSessionFactory().openSession();
        allBooks = session.createQuery("from Book", Book.class).getResultList();
        for (int i = 0; i < allBooks.size(); i++){
            allBooks.get(i).setNrInList(String.valueOf(i+1));
        }
        session.close();

        return allBooks;
    }

    public void deleteBook(int id){
        Transaction transaction = null;
        try{
            Session session = DBConfig.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            Book book = getBookById(id);
            session.delete(book);
            transaction.commit();
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
