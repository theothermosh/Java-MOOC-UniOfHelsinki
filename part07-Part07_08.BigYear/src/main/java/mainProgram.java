import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();
        
        while (true) {            
            System.out.print("? ");
            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            switch (command) {
                case "Add":
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("Name in Latin: ");
                    String latinName = scan.nextLine();

                    birds.add(new Bird(name, latinName));
                    break;
                case "Observation":
                    System.out.print("Bird? ");
                    String bird = scan.nextLine();
                    for (Bird aBird : birds) {
                        if (aBird.getName().equals(bird)) {
                            aBird.observe();
                        }
                    }
                    break;
                case "All":
                    for (Bird aBird : birds) {
                        System.out.println(aBird);
                    }
                    break;
                case "One":
                    System.out.print("Bird? ");
                    String aBird = scan.nextLine();
                    for (Bird bird1 : birds) {
                        if (bird1.getName().equals(aBird)) {
                            System.out.println(bird1);
                        }
                    }
                    break;
            }
        }
    }

}
