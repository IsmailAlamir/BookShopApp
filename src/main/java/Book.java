import java.util.ArrayList;
import java.util.Scanner;

public class Book {

    static ArrayList<Book> booksLists = new ArrayList<>();

    private String name;
    private double price;
    private String Author ;

    Book(){
    }

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        Author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public static void displayAllBook(){
        ArrayList <Book> listBook = Book.booksLists;
        if(listBook.isEmpty()){
            System.out.println("there is no books");
        }else{
            for (Book book: listBook) {
                System.out.println(book.getName() + " " + book.getAuthor()+ " " + book.getPrice());

            }}
    }

    public static void addBook (Scanner scanner){

        Book newBook = new Book();

        System.out.println("enter the name of the book :");
        String booksName = scanner.nextLine();
        newBook.setName(booksName);

        System.out.println("enter the name of the author :");
        String booksAuthor = scanner.nextLine();
        newBook.setAuthor(booksAuthor);

        System.out.println("enter the price :");
        double booksPrice = scanner.nextDouble();
        newBook.setPrice(booksPrice);
        scanner.nextLine(); // consume the leftover newline character


        Book.booksLists.add(newBook);
    }

    public static Book getBookByName(String name){

        for (Book book:booksLists) {
            if (book.name.equals(name)){
                return book;
            }
            
        }
    return null;}

    public static void updateBook(Scanner scanner){
        boolean isMenu = true;
        System.out.println("write book name");
        String booksNameU = scanner.nextLine();
        Book book = Book.getBookByName(booksNameU);
        if (book == null) {
            System.out.println("no book in this name");
        }else{
            while(isMenu){
                System.out.println("----Update Menu----");
                System.out.println("1. Update book name");
                System.out.println("2. Update Author name");
                System.out.println("3. Update price");
                System.out.println("4. Back to Main Menu");
                System.out.println("5. Exit");
                System.out.println("Enter your choice: ");
                try{
                    int choiceNumberU = scanner.nextInt();
                    scanner.nextLine(); // consume the leftover newline character
                    switch (choiceNumberU) {
                        case 1:
                            System.out.println("enter the new name");
                            String newName= scanner.nextLine();
                            book.setName(newName);
                            break;
                        case 2:
                            System.out.println("enter the new Author name");
                            String newAuthorName= scanner.nextLine();
                            book.setAuthor(newAuthorName);
                            break;
                        case 3:
                            System.out.println("enter the new price");
                            double newPrice= scanner.nextDouble();
                            book.setPrice(newPrice);
                            scanner.nextLine(); // consume the leftover newline character
                            break;
                        case 4:
                            isMenu = false;
                            break;

                        default:
                            System.out.println("Invalid choice. Please enter a number from the list.");

                    }

                } catch (Exception e) {
                    System.out.println("Enter a number from the list");
                    scanner.next(); // clear scanner buffer
                }}
        }
    }

    public static void deleteBook(Scanner scanner){
        System.out.println("write book name");
        String booksNameU = scanner.nextLine();
        Book book = Book.getBookByName(booksNameU);
        if (book == null) {
            System.out.println("no book in this name");
        }else{
            booksLists.remove(book);
            System.out.println("removed!");

        }

    }

    public static void searchBook(Scanner scanner){
            System.out.println("write book name");
            String booksNameU = scanner.nextLine();
            Book book = Book.getBookByName(booksNameU);
            if (book == null) {
                System.out.println("no book in this name");
            }else{
                System.out.println(book.getName() + " " + book.getAuthor()+ " " + book.getPrice());
            }
    }
}
