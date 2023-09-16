import java.io.Serializable;

public class Car implements Serializable {
    private String name;
    private int speed;
    private int consumption;

    public Car(String name, int speed, int consumption) {
        this.name = name;
        this.speed = speed;
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Speed: " + speed + " Consumption: " + consumption;
    }
}
