
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String output = "Impossible!";
        
        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.nextLine());
        
        if (age >= 0 && age <= 120) {
            output = "OK";
        }
        System.out.println(output);
    }
}
