import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> points = takeInput(scanner);
        System.out.println("Point average (all): " + Grades.average(points));
        if (Grades.averagePassing(points) == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + Grades.averagePassing(points));
        }
        System.out.println("Pass percentage: " + Grades.passPercentage(points));
        Grades.gradeDistribution(points);
    }
    
    public static ArrayList<Integer> takeInput(Scanner scanner) {
        ArrayList<Integer> inputs = new ArrayList<>();
        System.out.println("Enter point totals, -1 stops:");
        while(true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            
            if (input >= 0 && input <= 100) {
                inputs.add(input);
            }
        }
        System.out.println(inputs);
        return inputs;
    }
}
