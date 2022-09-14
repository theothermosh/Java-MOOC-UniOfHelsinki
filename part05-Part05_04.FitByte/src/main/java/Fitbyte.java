public class Fitbyte {
    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public int getAge() {
        return age;
    }

    public int getRestingHeartRate() {
        return restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        double maximumHeartRate = 206.3 - (0.711 * this.getAge());
        
        return ((maximumHeartRate - this.getRestingHeartRate()) * (percentageOfMaximum) + this.getRestingHeartRate());
    }
}
