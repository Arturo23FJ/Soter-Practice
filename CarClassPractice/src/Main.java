public class Main {
    public static void main(String[] args) {
        Car alfaRomeo = new Car("Alfa Romeo", 260, 34, 3000);
        Car fordFocus = new Car("Ford Focus", 230, 58, 2700);

        System.out.println(alfaRomeo);
        System.out.println(fordFocus);

        alfaRomeo.setDirection(375);
        System.out.println("The new direction of the Alfa is: " + alfaRomeo.getDirection());

        Car volkswagen = new Car("Volkswagen", -30, -400, 2300);

        System.out.println(volkswagen);

        Car[] cars = new Car[]{alfaRomeo, fordFocus, volkswagen};

        System.out.println("The average price of the cars is: " + averagePrice(cars));
        System.out.println("The most expensive car is the: " + getMostExpensiveCar(cars).getType()
                + ", it's price is: " + getMostExpensiveCar(cars).getPrice());
    }

    public static double averagePrice(Car[] cars){
        double average;
        double sum = 0.0;
        for(Car car : cars){
            sum += car.getPrice();
        }
        average = sum / cars.length;
        return average;
    }

    public static Car getMostExpensiveCar(Car[] cars){
        Car mostExpensive = cars[0];
        for (Car car : cars){
            if (car.getPrice() > mostExpensive.getPrice()){
                mostExpensive = car;
            }
        }
        return mostExpensive;
    }
}