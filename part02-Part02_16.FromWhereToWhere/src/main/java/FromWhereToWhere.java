
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to? ");
        int whereTo = scanner.nextInt();
        System.out.println("Where from? ");
        int whereFrom = scanner.nextInt();
        
        for (; whereFrom <= whereTo; whereFrom++) {
            System.out.println(whereFrom);
        }
    }
}
