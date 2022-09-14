
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatestAge = 0;
        while (true) {            
            String input = scanner.nextLine();
            if (!scanner.hasNextLine()) {
                break;
            } else {
                String[] pieces = input.split(",");
                if (greatestAge < Integer.valueOf(pieces[1])) {
                    greatestAge = Integer.valueOf(pieces[1]);
                }
            }
        }
        System.out.println("Age of the oldest: " + greatestAge);
    }
}
