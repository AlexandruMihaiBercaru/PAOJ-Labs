package Ex1_Bookstore;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int pageCount;

    public Book(String title, String author, String publisher, int pageCount){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return
                "BOOK_TITLE: \"" + title.toUpperCase() + "\"" + '\n' +
                "BOOK_AUTHOR: " + author + '\n' +
                "BOOK_PUBLISHER: " + publisher.toLowerCase() + '\n'
        ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        Book book = (Book) o;
        return  Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publisher, book.publisher);
    }
    /*
     am considerat ca doua carti sunt in duplicat daca au acelasi titlu, autor si editura
     (nu e necesar sa corespunda si numarul de pagini)
    */

}
