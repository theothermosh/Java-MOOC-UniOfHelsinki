import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scan;

    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        this.scan = scan;
    }
    
    public void start() {
        while (true) {           
            System.out.print("Command: ");
            String command = scan.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String toAdd = scan.nextLine();
                list.add(toAdd);
            } else if (command.equals("list")) {
                list.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int idx = scan.nextInt();
                list.remove(idx);
            }
        }
    }
}
