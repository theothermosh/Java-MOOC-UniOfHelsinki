public class Cube {
    private int length;

    public Cube(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
    
    public int volume() {
        return length * length * length;
    }

    @Override
    public String toString() {
        return "The length of the edge is " + getLength() + " and the volume " + volume();
    }
}
