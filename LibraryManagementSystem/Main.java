package LibraryManagementSystem;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Library lib = new Library();


        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "453" , 1);
        Book book2 = new Book("1984", "George Orwell", "339", 2);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "599", 3);

        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);

        lib.displayAllBook();
        System.out.println();

        lib.removeBook(3);
        System.out.println();
        
        lib.displayAllBook();

    }
};

class Book {
    private String title;
    private String author;
    private String price;
    private int id;

    public Book(String title, String author, String price, int id){
        this.title = title;
        this.author = author;
        this.price = price;
        /* id = (int)(Math.random() * 100000); */
        this.id = id;
    }

    // getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
};

class Library {
    private ArrayList<Book>books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(int id){
        Book bookToRemove = null;

        for(Book book : books){
            if(book.getId() == id){
                bookToRemove = book;
                break;
            }
        }

        if(bookToRemove != null){
            books.remove(bookToRemove);
            System.out.println(bookToRemove +" is being removed.");
        }else {
            System.out.println("Book not found.");
        }
    }

    public void displayAllBook() {
        System.out.println("Displaying all books...");
        for(Book book : books){
            System.out.println(book);
        }
    }
}
