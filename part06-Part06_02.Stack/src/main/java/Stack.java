import java.util.ArrayList;

public class Stack {
    ArrayList<String> strings = new ArrayList<>();

    public Stack() {
    }
    
    public boolean isEmpty() {
        return strings.size() == 0;
    }
    
    public void add(String value) {
        strings.add(0, value);
    }
    
    public ArrayList<String> values() {
        return strings;
    }
    
    public String take() {
        String topmost = strings.get(0);
        strings.remove(0);
        
        return topmost;
    }
}
