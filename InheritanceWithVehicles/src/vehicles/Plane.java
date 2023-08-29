package vehicles;

public class Plane extends Vehicle{
    private int height;

    public Plane(String name, int consumption, int speed, int height) {
        super(name, consumption, speed);
        this.height = height;
    }

    public String toString(){
        return super.toString() + ", Height: " + this.height;
    }
}
