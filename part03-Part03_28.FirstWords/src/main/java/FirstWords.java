
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {            
            String input = scanner.nextLine();
            if (!scanner.hasNextLine()) {
                break;
            } else {
                String[] pieces = input.split(" ");
                System.out.println(pieces[0]);
            }
        }
    }
}
