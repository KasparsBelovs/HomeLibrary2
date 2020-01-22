package hibernate.entities;

import javax.persistence.*;

@Entity
@Table (name = "homelibrary")

public class Book {

    @Id
    @Column (name = "id_homelibrary")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "Books_name")
    private String nameBooks;

    @Column (name = "Books_author")
    private String authorBooks;

    @Column (name = "Year")
    private int yearBooks;

    @Column (name = "Page_count")
    private int pageCountBooks;

    @Column (name = "NrInList")
    private  String nrInList;

    public int getId() {
        return id;
    }

    public String getNameBooks() {
        return nameBooks;
    }

    public void setNameBooks(String nameBooks) {
        this.nameBooks = nameBooks;
    }


    public String getAuthorBooks() {
        return authorBooks;
    }

    public void setAuthorBooks(String authorBooks) {
        this.authorBooks = authorBooks;
    }

    public int getYearBooks() {
        return yearBooks;
    }

    public void setYearBooks(int yearBooks) {
        this.yearBooks = yearBooks;
    }

    public int getPageCountBooks() {
        return pageCountBooks;
    }

    public void setPageCountBooks(int pageCountBooks) {
        this.pageCountBooks = pageCountBooks;
    }

    public String getNrInList() {
        return nrInList;
    }

    public void setNrInList(String nrInList) {
        this.nrInList = nrInList;
    }

}
