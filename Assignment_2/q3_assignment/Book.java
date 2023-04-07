import java.util.Scanner;


public class Book {
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int year;
    private double price;
    private int quantity;

    // Constructors
    public Book(String title, String author, String publisher, String isbn, int year, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Business logic methods
    public void increaseQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void decreaseQuantity(int quantity) {
        if (this.quantity < quantity) {
            System.out.println("Error: Not enough quantity in stock!");
        } else {
            this.quantity -= quantity;
        }
    }

    public double getInventoryValue() {
        return price * quantity;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get book details from the user
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter book author: ");
        String author = scanner.nextLine();

        System.out.print("Enter book publisher: ");
        String publisher = scanner.nextLine();

        System.out.print("Enter book ISBN: ");
        String isbn = scanner.nextLine();

        System.out.print("Enter book year: ");
        int year = scanner.nextInt();

        System.out.print("Enter book price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter book quantity: ");
        int quantity = scanner.nextInt();

        // Create a Book object with the user input
        Book book = new Book(title, author, publisher, isbn, year, price, quantity);

        // Use the Book methods to manage the inventory
        System.out.println("Book inventory management");
        System.out.println("Current quantity: " + book.getQuantity());

        System.out.print("Enter quantity to add: ");
        int quantityToAdd = scanner.nextInt();
        book.increaseQuantity(quantityToAdd);
        System.out.println("New quantity: " + book.getQuantity());

        System.out.print("Enter quantity to remove: ");
        int quantityToRemove = scanner.nextInt();
        book.decreaseQuantity(quantityToRemove);
        System.out.println("New quantity: " + book.getQuantity());

        double inventoryValue = book.getInventoryValue();
        System.out.println("Inventory value: " + inventoryValue);

        scanner.close();
    }
}
