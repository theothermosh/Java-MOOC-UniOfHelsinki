
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longestNameLength = 0;
        int sum = 0;
        int count = 0;
        String longest = "";
        
        while (true) {            
            String input = scanner.nextLine();
            if (!scanner.hasNextLine()) {
                break;
            } else {
                String[] pieces = input.split(",");
                if (longestNameLength < Integer.valueOf(pieces[0].length())) {
                    longestNameLength = Integer.valueOf(pieces[0].length());
                    longest = pieces[0];
                }
                sum += Integer.valueOf(pieces[1]);
                count++;
            }
        }
        System.out.println("Longest name: " + longest);
        System.out.println("Average of birth years: " + ((double) sum / count));
    }
}
