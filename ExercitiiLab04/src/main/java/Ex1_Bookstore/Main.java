package Ex1_Bookstore;

import java.util.Scanner;

public class Main {

    private static void displayMenu(){
        System.out.println("\n[1.] List the books.\n" +
                    "[2.] List the information of a specific book.\n" +
                    "[3.] Add a new book.\n" +
                    "[4.] Modify a book.\n" +
                    "[5.] Delete a book.\n" +
                    "[6.] Check for duplicates.\n" +
                    "[7.] Compare book sizes.\n" +
                    "[0.] Exit.")
        ;

        System.out.println("Your choice... ");
    }

    public static void main(String[] args) {
        BookstoreTest myBookstore = new BookstoreTest(128);
        BookstoreCheck checker = new BookstoreCheck();

        // pentru testare:
//        Book b1 = new Book("Never Let Me Go", "Kazuo Ishiguro", "Macmillan", 230);
//        myBookstore.addBook(b1);
//        Book b2 = new Book("Never Let Me Go", "Kazuo Ishiguro", "Macmillan", 230);
//        myBookstore.addBook(b2);
//        Book b3 = new Book("Shogun", "James Clavell", "Blackstone Publishing, Inc", 1310);
//        myBookstore.addBook(b3);
//        Book b4 = new Book("Norwegian Wood", "Haruki Murakami", "Penguin", 250);
//        myBookstore.addBook(b4);
//        Book b5 = new Book("Norwegian Wood", "Haruki Murakami", "Penguin", 251);
//        myBookstore.addBook(b5);


        System.out.println("--------WELCOME!------");
        displayMenu();
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        while (true){
            if(choice >= 1 && choice <= 7){
                switch(choice){
                    case 1:
                        myBookstore.listBooks();
                        break;
                    case 2:
                        myBookstore.getBook();
                        break;
                    case 3:
                        myBookstore.addBook();
                        break;
                    case 4:
                        myBookstore.updateBook();
                        break;
                    case 5:
                        myBookstore.deleteBook();
                        break;
                    case 6:
                        checker.checkForDuplicates(myBookstore);
                        break;
                    case 7:
                        checker.compareBookThickness(myBookstore);
                        break;

                }
            }
            else if(choice == 0){
                break;
            }

            displayMenu();
            choice = input.nextInt();
        }
    }
}
