public class Main {
    public static void main(String[] args) {
        try {
            double result = division(4, 0);
            System.out.println("The result of the division: " + result);

        } catch (DivideByZeroException dbze){
            System.out.println("An error occured: " + dbze.getMessage());
        }
    }

    public static double division(double a, double b){
        if(b == 0){
            throw new DivideByZeroException("Cannot divide by 0!");
        }
        return a / b;
    }
}