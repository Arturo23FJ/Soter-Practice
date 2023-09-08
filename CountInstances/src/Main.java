/*Let's have Vehicles: Tram, Car, Bus.
Put them in an array and call the method which can tell the types of the Vehicle.
Count how many instances do we have of each types
 */

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        Car c4 = new Car();
        Car c5 = new Car();
        Bus b1 = new Bus();
        Bus b2 = new Bus();
        Bus b3 = new Bus();
        Tram t1 = new Tram();
        Tram t2 = new Tram();

        Vehicle[] vehicles = new Vehicle[]{c1, c2, c3, c4, c5, b1, b2, b3, t1, t2};

        vehicleCounter(vehicles);

        System.out.println(vehicles[3].getType());
        System.out.println(vehicles[6].getType());
        System.out.println(vehicles[9].getType());

    }

    public static void vehicleCounter(Vehicle[] vehicles){
        int countCar = 0;
        int countBus = 0;
        int countTram = 0;

        for (Vehicle vehicle : vehicles){
            if(vehicle instanceof Car){
                countCar++;
            } else if(vehicle instanceof Bus){
                countBus++;
            } else if (vehicle instanceof Tram) {
                countTram++;
            }
        }
        System.out.println("We have " + countCar + " cars, " + countBus + " buses and " + countTram + " trams");
    }
}