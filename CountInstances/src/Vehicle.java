import java.util.Objects;

public class Vehicle {
    int speed;

    public Vehicle() {
    }

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public String getType(){
        return "I am a " + getClass().getSimpleName();
    }
}
