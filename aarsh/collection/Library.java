package aarsh.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Create a class called Library that represents a library. The library should have a List collection of books and it should have the following methods:

A method called addBook which accepts a Book object and adds it to the List collection of books.
A method called searchBook which accepts a String title and returns the Book object with the matching title, or null if no such book is found.
A method called removeBook which accepts a String title and removes the Book object with the matching title from the List collection of books, if it exists.
A method called getAllBooks which returns a List of all the books in the library.
Constraints:

The class Book should have following properties: title,author,publisher and year of publication.
The class Library should be encapsulated i.e. the internal state of the class should be hidden from the client code.
Note:

Use encapsulation principles in your solution.
You are allowed to use any standard library classes or interfaces that are part of the Java SDK to implement the Library class.
You can use the ArrayList class to implement the List collection of books.
Example:


Library library = new Library();
Book book1 = new Book("Book1","Author1","Publisher1",2000);
Book book2 = new Book("Book2","Author2","Publisher2",2010);
Book book3 = new Book("Book3","Author3","Publisher3",2018);
library.addBook(book1);
library.addBook(book2);
library.addBook(book3);
List<Book> books = library.getAllBooks();
// returns [Book1,Book2,Book3]
Book searchedBook = library.searchBook("Book2");
// returns Book2
library.removeBook("Book2");
List<Book> books = library.getAllBooks();
// returns [Book1,Book3]
You can use this problem statement to create a class Library with the methods specified in the problem statement.
 */
public class Library {
    List<Book> books;

    Library() {
        this.books = new ArrayList<Book>();
    }

    // CRUD --> Create, Read, Update, Delete
    // create
    public void addBook(Book book) {
        books.add(book);
    }

    // read all books
    public void getAllBooks() {
        System.out.println();
        int i = 1;
        for (Book book : books) {
            System.out.println(i + " Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Publisher: "
                    + book.getPublisher() + ", Year: " + book.getYear());
            i++;
        }
        System.out.println();
    }

    /*
     * update ---> enter the title of the book you want to update, ----> what you
     * want to update(title, author, etc. )
     * ---> title --> enter the new title of the book
     */
    // read
    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    // delete
    public boolean removeBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                books.remove(i);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        Book book = new Book();
        while (true) {
            System.out.println("1 --- add books");
            System.out.println("2 --- search book");
            System.out.println("3 --- remove book");
            System.out.println("4 --- get all books");
            System.out.println("5 --- exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the title of the book: ");
                    sc.nextLine();
                    book = new Book();
                    String title = sc.nextLine();
                    book.setTitle(title);
                    System.out.print("Enter author for the book " + title + ": ");
                    String author = sc.nextLine();
                    book.setAuthor(author);
                    System.out.print("Enter publisher for the book " + title + ": ");
                    String publisher = sc.nextLine();
                    book.setPublisher(publisher);
                    System.out.print("Enter year in which  the book " + title + " was published: ");
                    int year = sc.nextInt();
                    book.setYear(year);
                    library.addBook(book);
                    // System.out.println(library.getAllBooks());
                    break;
                case 2:
                    System.out.print("Enter the title to search the book: ");
                    sc.nextLine();
                    title = sc.nextLine();
                    System.out.println(library.searchBook(title));
                    break;
                case 3:
                    System.out.print("Enter the title to remove the book: ");
                    sc.nextLine();
                    title = sc.nextLine();
                    System.out.println(library.removeBook(title));
                    break;
                case 4:
                    System.out.println("The books in the library are: ");
                    library.getAllBooks();
                    break;
                case 5:
                    System.out.println("Thank you for visiting us....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a valid choice....");
            }
        }
    }
}
