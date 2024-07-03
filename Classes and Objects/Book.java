public class Book {
    // Instance variables
    private String title;
    private String author;
    private int price;

    // Constructor
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book's Title: " + title);
        System.out.println("Book's Author's name: " + author);
        System.out.println("Book's price is: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Book b1 = new Book("Concept of Physics", "Hc Verma", 299);
        Book b2 = new Book("Maths", "Rd Sharma", 499);

        b1.displayDetails();
        b2.displayDetails();
    }
}