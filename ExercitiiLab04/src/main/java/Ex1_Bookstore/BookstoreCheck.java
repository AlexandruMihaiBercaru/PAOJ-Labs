package Ex1_Bookstore;
import java.util.Arrays;

public class BookstoreCheck {


    public void checkForDuplicates(BookstoreTest bookstore) {
        System.out.println("Which book would you like to check?... ");
        int bookId = bookstore.readBookIndex() - 1;

        int copyCounter = 0;
        int[] copies = new int[128]; Arrays.fill(copies, -1);
        Book[] books = bookstore.getBooks();

        for (int i = 0; i < bookstore.getLastIndex(); i++) {
            if (i != bookId && books[i].equals(books[bookId]) && books[i] != null) {
                copies[copyCounter++] = i+1;
            }
        }

        System.out.println(copyCounter + " duplicates were found: ");
        for (var elem : copies){
            if (elem != -1)
                System.out.println(elem);
        }
    }


    public void compareBookThickness(BookstoreTest bookstore) {
        System.out.println("Which books would you like to compare?... ");
        int bookId1 = bookstore.readBookIndex() - 1;
        int bookId2 = bookstore.readBookIndex() - 1;

        System.out.println("The bigger book is: ");
        if (bookstore.getBooks()[bookId1].getPageCount() <=
                bookstore.getBooks()[bookId2].getPageCount()) {
            System.out.println(bookId2+1);
            System.out.println(bookstore.getBooks()[bookId2]);
        }
        else {
            System.out.println(bookId1+1);
            System.out.println(bookstore.getBooks()[bookId1]);
        }
    }
}
