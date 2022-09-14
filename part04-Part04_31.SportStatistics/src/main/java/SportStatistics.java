
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int gamesPlayed = 0;
        ArrayList<String> teams = new ArrayList<>();
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {                
                String line = fileReader.nextLine();
                String[] parts = line.split(",");
                teams.add(parts[0]);
                teams.add(parts[1]);
            }
        } catch (Exception e) {
            
        }
        
        for (String team1 : teams) {
            if (team1.equals(team)) {
                gamesPlayed++;
            }
        }
        
        System.out.println("Games: " + gamesPlayed);
    }

}
