import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {            
            System.out.print("Title: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            } else {
                System.out.print("Pages: ");
                int pages = Integer.valueOf(scanner.nextLine());
                System.out.print("Publication year: ");
                int year = Integer.valueOf(scanner.nextLine());
                books.add(new Book(name, pages, year));
            }
        }
        
        System.out.print("What information will be printed? ");
        String whatInfo = scanner.nextLine();
        if (whatInfo.equals("everything")) {
            for (Book book : books) {
                System.out.println(book.toString());
            }
        } else if (whatInfo.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getName());
            }
        }
    }
}
