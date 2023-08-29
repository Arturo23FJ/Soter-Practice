package vehicles;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Alfa Romeo", 8, 240);
        Plane plane = new Plane("Boeing", 300, 400, 11000);

        System.out.println(car);
        System.out.println(plane);
    }
}