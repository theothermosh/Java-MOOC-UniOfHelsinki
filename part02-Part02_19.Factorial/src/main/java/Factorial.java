
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int num = scanner.nextInt();
        long fact = 1;
        
        if (num == 0) {
            fact = 1;
        } else {
            for (int i = 2; i <= num; i++) {
                fact *= i;
            }
        }
        System.out.println("Factorial: " + fact);
    }
}
