
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double avg;
        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            
            if (number == 0) {
                break;
            } else {
                count++;
                sum += number;
            }
        }
        avg = (double) sum / count;
        System.out.println("Average of the numbers: " + avg);
    }
}
