
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int first = scanner.nextInt();
        System.out.println("Last number? ");
        int last = scanner.nextInt();
        int sum = 0;
        for (; first <= last; first++) {
            sum += first;
        }
        System.out.println("The sum is " + sum);
    }
}
