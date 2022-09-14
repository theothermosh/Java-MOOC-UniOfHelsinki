
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("First Name: ");
            String first = scanner.nextLine();
            if (first.equals("")) {
                break;
            } else {
                System.out.println("Last Name: ");
                String second = scanner.nextLine();
                System.out.println("Identification number: ");
                String id = scanner.nextLine();
                infoCollection.add(new PersonalInformation(first, second, id));
            }
            
        }
        
        for (PersonalInformation personalInformation : infoCollection) {
            System.out.println(personalInformation.getFirstName() + " " + personalInformation.getLastName());
        }
    }
}
