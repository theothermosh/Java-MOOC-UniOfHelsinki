
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg;
        while (true) {            
            int input = scanner.nextInt();
            
            if (input == 0) {
                break;
            } else if (input > 0) {
                sum += input;
                count++;
            }
        }
        if (count > 0) {
            avg = (double) sum / count;
            System.out.println(avg);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
