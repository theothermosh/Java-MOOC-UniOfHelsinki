import java.util.Scanner;

public class UserInterface {
    private JokeManager jokes;
    private Scanner scan;

    public UserInterface(JokeManager jokes, Scanner scan) {
        this.jokes = jokes;
        this.scan = scan;
    }
    
    public void start() {
        while (true) {            
            System.out.println("Commands:\n1 - add a joke\n2 - draw a joke\n3 - list jokes\nX - stop");
            String command = scan.nextLine();
            if (command.equals("X")) {
                break;
            } else if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scan.nextLine();
                jokes.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println(jokes.drawJoke());
            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                jokes.printJokes();
            }
        }
    }
}
