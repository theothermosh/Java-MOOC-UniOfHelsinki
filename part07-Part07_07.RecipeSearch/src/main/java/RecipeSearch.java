import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(source)
        String fileName = "recipes.txt";
        
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            System.out.print("File to read: " + fileName);
            System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program");
            System.out.print("Enter command: ");
            
        } catch (Exception e) {
            
        }
        
        
    }

}
