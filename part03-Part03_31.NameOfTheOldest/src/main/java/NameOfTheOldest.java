
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int greatestAge = 0;
        String oldest = "";
        while (true) {            
            String input = scanner.nextLine();
            if (!scanner.hasNextLine()) {
                break;
            } else {
                String[] pieces = input.split(",");
                if (greatestAge < Integer.valueOf(pieces[1])) {
                    greatestAge = Integer.valueOf(pieces[1]);
                    oldest = pieces[0];
                }
            }
        }
        System.out.println("Name of the oldest: " + oldest);
    }
}
