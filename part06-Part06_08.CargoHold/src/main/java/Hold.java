
import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> cases = new ArrayList<>();

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maximumWeight) {
            cases.add(suitcase);
        }
    }

    @Override
    public String toString() {
        if (cases.isEmpty()) {
            return "no suitcases (0 kg)";
        } else if (cases.size() == 1) {
            return cases.size() + " suitcase (" + totalWeight() + " kg)";
        } else {
            return cases.size() + " suitcases (" + totalWeight() + " kg)";
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase aCase : cases) {
            totalWeight += aCase.totalWeight();
        }
        
        return totalWeight;
    }
    
    public void printItems() {
        for (Suitcase aCase : cases) {
            aCase.printItems();
        }
    }
}
