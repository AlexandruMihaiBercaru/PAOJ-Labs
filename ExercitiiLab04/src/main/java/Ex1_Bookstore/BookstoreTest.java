package Ex1_Bookstore;

import java.util.Scanner;

public class BookstoreTest {

    private final int bookstoreSize;
    private Book[] books;
    private int idx = 0; // implicit 0

    public BookstoreTest(int bookstoreSize) {
        this.bookstoreSize = bookstoreSize;
        this.books = new Book[bookstoreSize];
    }

    public Book[] getBooks() {
        return books;
    }

    public int getLastIndex() {
        return idx;
    }

    public void addBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Add the title: ");
        String title = sc.nextLine();

        System.out.println("Add the author: ");
        String author = sc.nextLine();

        System.out.println("Add the publisher: ");
        String publisher = sc.nextLine();

        System.out.println("Add the number of pages: ");
        int pageNo = sc.nextInt();

        Book newBook = new Book(title, author, publisher, pageNo);
        if(idx < bookstoreSize){
            books[idx++] = newBook;
            System.out.println("The book has been added to the list.");
        }
        else{
            throw new RuntimeException("Bookstore is full!!!");
        }
    }

    public void addBook(Book newBook){
        if(idx < bookstoreSize){
            books[idx++] = newBook;
            System.out.println("The book has been added to the list.");
        }
        else{
            throw new RuntimeException("Bookstore is full!!!");
        }
    }

    public void listBooks(){
        System.out.println("BOOKSTORE INVENTORY\n");
        for(Book b: books){
            if(b!=null){
                System.out.println(b);
                System.out.println("-----------------");
            }
        }
    }

    public int readBookIndex(){
        Scanner sc = new Scanner(System.in);
        int bookId = sc.nextInt();
        while(bookId <= 0 || bookId > idx || books[bookId-1] == null){
            System.out.println("Invalid ID, please try again...");
            System.out.println("Please enter a valid ID: ");
            bookId = sc.nextInt();
        }
        return bookId;
    }

    public void getBook(){
        System.out.println("Get the information for the following book: ");
        int bookId = readBookIndex();
        System.out.println(books[bookId-1]);
    }

    public void deleteBook(){
        System.out.println("Please enter the id of the book you would like to delete: ");
        int bookId = readBookIndex();
        books[bookId-1] = null;
        System.out.println("Book has been deleted");
    }

    public void updateBook(){
        System.out.println("Please enter the id of the book you would like to update: ");
        int bookId = readBookIndex();
        System.out.println(books[bookId-1]);
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------");
        System.out.println("Modified title: ");
        String newTitle = sc.nextLine();
        if(!newTitle.equals("-")){
            books[bookId-1].setTitle(newTitle);
        }

        System.out.println("Modified author: ");
        String newAuthor = sc.nextLine();
        if(!newAuthor.equals("-")){
            books[bookId-1].setAuthor(newAuthor);
        }

        System.out.println("Modified publisher: ");
        String newPublisher = sc.nextLine();
        if(!newPublisher.equals("-")){
            books[bookId-1].setPublisher(newPublisher);
        }

        System.out.println("Modified number of pages: ");
        String newPageNo = sc.nextLine();
        if(!newPageNo.equals("-")){
            int pageCount = Integer.parseInt(newPageNo);
            books[bookId-1].setPageCount(pageCount);
        }

        System.out.println("Book has been updated");
    }
}
