import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BookShopApp {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);

        while(true){
            System.out.println("----Main Menu----");
            System.out.println("1. Display all books");
            System.out.println("2. Add book");
            System.out.println("3. Update book");
            System.out.println("4. Delete book");
            System.out.println("5. Search book");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            try{
                int choiceNumber = scanner.nextInt();
                scanner.nextLine(); // consume the leftover newline character

                switch (choiceNumber){
                    case 1:
                        Book.displayAllBook();
                        break;
                    case 2:
                        Book.addBook(scanner);
                        break;
                    case 3:
                        Book.updateBook(scanner);
                        break;
                    case 4:
                        Book.deleteBook(scanner);
                        break;
                    case 5:
                        Book.searchBook(scanner);
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number from the list.");


                }
            } catch (Exception e) {
                System.out.println("Enter a number from the list");
                scanner.next(); // clear scanner buffer

            }



        }


    }
}
