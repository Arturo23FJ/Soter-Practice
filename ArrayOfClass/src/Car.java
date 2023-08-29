public class Car {
    private String type;
    private int[] sparePartPrices;

    public Car(String type, int[] sparePartPrices) {
        this.type = type;
        this.sparePartPrices = sparePartPrices;
    }

    public int priceOfCar(){
        int sum = 0;
        for(int price : sparePartPrices){
            sum += price;
        }
        return sum;
    }

}
