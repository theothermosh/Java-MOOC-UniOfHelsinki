
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string;
        int number;
        double decimal;
        boolean bool;
        System.out.println("Give a string:");
        string = String.valueOf(scan.nextLine());
        System.out.println("Give an integer:");
        number = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        decimal = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        bool = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + decimal);
        System.out.println("You gave the boolean " + bool);
    }
}
