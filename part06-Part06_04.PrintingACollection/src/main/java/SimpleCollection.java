
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String returnString = ""; 
        
        if (this.elements.isEmpty()) {
            returnString = "The collection " + this.name + " is empty.";
        } else if(this.elements.size() == 1) {
            returnString = "The collection " + name + " has " + this.elements.size() + " element:\n" + this.elements.get(0);
        } else {
            returnString = "The collection " + name + " has " + this.elements.size() + " elements:\n";
            for (String element : elements) {
                returnString += element + "\n";
            }
        }
        
        return returnString;
    }
    
    
}
