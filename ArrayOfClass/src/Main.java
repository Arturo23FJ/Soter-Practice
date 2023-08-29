public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[]{new Car("Audi", new int[]{150, 800, 1200, 970}),
                                new Car("Alfa Romeo", new int[]{170, 890, 1400, 600}),
                                new Car("Mitsubishi", new int[]{190, 910, 1540, 1150})};

        CarDealership carDealership = new CarDealership(cars);

        System.out.println("The price of the cars in the dealership is: " + carDealership.priceOfAllCars());
    }
}