public class Main {
    public static void main(String[] args) {
        Car alfaRomeo = new Car("Alfa Romeo", 260, 34);
        Car fordFocus = new Car("Ford Focus", 230, 58);

        System.out.println(alfaRomeo);
        System.out.println(fordFocus);

        alfaRomeo.setDirection(375);
        System.out.println("The new direction of the Alfa is: " + alfaRomeo.getDirection());

        Car volkswagen = new Car("Volkswagen", -30, -400);

        System.out.println(volkswagen);
    }
}