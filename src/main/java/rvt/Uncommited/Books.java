package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {

    // inner book class
    public static class Book {
        private String bookTitle;
        private int pageCount;
        private int releaseYr;

        // constructor
        public Book(String bookTitle, int pageCount, int releaseYr) {
            this.bookTitle = bookTitle;
            this.pageCount = pageCount;
            this.releaseYr = releaseYr;
        }

        // get title
        public String fetchTitle() {
            return this.bookTitle;
        }

        // string output format (used in print)
        @Override
        public String toString() {
            return bookTitle + ", " + pageCount + " pages, " + releaseYr;
        }
    }

    // list to store book stuff
    private ArrayList<Book> bookzList = new ArrayList<>();

    // input reader 
    private Scanner scan = new Scanner(System.in);

    // read books from user input
    public void inputBooks() {
        while (true) {
            System.out.print("Title: ");
            String name = scan.nextLine();

            // empty catcher
            if (name.trim().isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pgz = Integer.parseInt(scan.nextLine());

            System.out.print("Publication year: ");
            int y = Integer.parseInt(scan.nextLine());

            // add new book into list
            bookzList.add(new Book(name, pgz, y));
        }
    }

    // prints based on what the user asked for
    public void output(String whatToShow) {
        if (whatToShow.equals("everything")) {
            for (Book b : bookzList) {
                System.out.println(b);
            }
        } else if (whatToShow.equals("name")) {
            for (Book b : bookzList) {
                System.out.println(b.fetchTitle());
            }
        }
    }

    public static void main(String[] args) {
        // main logic starts here
        BookManager thing = new BookManager();

        thing.inputBooks();  // collect info

        System.out.print("\nWhat to print (everything/name): ");
        String choice = thing.scan.nextLine();

        System.out.println();

        thing.output(choice);  // show output
    }
}