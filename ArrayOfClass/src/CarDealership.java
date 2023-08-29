public class CarDealership {
    Car[] cars;

    public CarDealership(Car[] cars) {
        this.cars = cars;
    }
    public int priceOfAllCars(){
        int sum = 0;

        for (Car car : cars) {
            sum += car.priceOfCar();
        }
        return sum;
    }
}
