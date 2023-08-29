package vehicles;

public class Vehicle {
    private String name;
    private int consumption;
    private int speed;

    public Vehicle() {
    }

    public Vehicle(String name, int consumption, int speed) {
        this.name = name;
        this.consumption = consumption;
        this.speed = speed;
    }

    public String toString(){
        return "Name: " + this.name + ", Consumption: " + this.consumption + ", Speed: " + this.speed;
    }
}
