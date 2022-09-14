
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            String firstString = "First: " + first + "/100";
            String secondString = "Second: " + second + "/100";
            System.out.println(firstString);
            System.out.println(secondString);
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            switch (command) {
                case "add":
                    if (amount < 0) {
                        break;
                    }
                    if (first + amount < 100) {
                        first += amount;
                    } else {
                        first = 100;
                    }
                    break;
                case "move":
                    if (first - amount < 0) {
                        amount = first;
                    }
                    if (amount >= 100) {
                        first = 0;
                        second = 100;
                    } else if (second + amount <= 100) {
                        second += amount;
                        first -= amount;
                    } else if (amount + second > 100 && amount + first > 100) {
                        second = 100;
                        first = 0;
                    }
                    break;
                case "remove":
                    if (amount > second) {
                        amount = 0;
                    } else {
                        second -= amount;
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
