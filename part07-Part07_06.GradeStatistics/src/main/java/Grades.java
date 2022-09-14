import java.util.ArrayList;

public class Grades {
    public static double average(ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        
        double average = (double) sum / numbers.size();
        
        return average;
    }
    
    public static double averagePassing(ArrayList<Integer> numbers) {
        int sum = 0;
        int passCount = 0;
        for (Integer number : numbers) {
            if (number >= 50) {
                sum += number;
                passCount++;
            }
        }
        
        double average = (double) sum / passCount;
        
        return average;
    }
    
    public static double passPercentage(ArrayList<Integer> numbers) {
        int passCount = 0;
        for (Integer number : numbers) {
            if (number >= 50) {
                passCount++;
            }
        }
        return ((double) passCount / numbers.size() * 100);
    }
    
    public static void gradeDistribution(ArrayList<Integer> numbers) {
        int fiveCount = 0;
        int fourCount = 0;
        int threeCount = 0;
        int twoCount = 0;
        int oneCount = 0;
        int failCount = 0;
        
        for (Integer number : numbers) {
            if (number >= 90) {
                fiveCount++;
            } else if (number >= 80) {
                fourCount++;
            } else if (number >= 70) {
                threeCount++;
            } else if (number >= 60) {
                twoCount++;
            } else if (number >= 50) {
                oneCount++;
            } else {
                failCount++;
            }
        }
        
        System.out.print("5: ");
        for (int i = 0; i < fiveCount; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("4: ");
        for (int i = 0; i < fourCount; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("3: ");
        for (int i = 0; i < threeCount; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("2: ");
        for (int i = 0; i < twoCount; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("1: ");
        for (int i = 0; i < oneCount; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("0: ");
        for (int i = 0; i < failCount; i++) {
            System.out.print("*");
        }
    }
}
