import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(multiplyWithScanner(100));
        System.out.println(divideWithScanner(100));
    }

    public static int multiplyWithScanner(int limit){
        Scanner scanner = new Scanner(System.in);
        int input;
        int result = 1;

        while (scanner.hasNextInt()){
            input = scanner.nextInt();
            result *= input;
            if(result >= limit){
                break;
            }
        }

        return result;
    }

    public static double divideWithScanner(double dividend){
        Scanner scanner = new Scanner(System.in);
        double divisor;
        double remainder = 0.0;

        while (scanner.hasNextDouble()){
            divisor = scanner.nextDouble();
            remainder = dividend / divisor;
            dividend = remainder;
            if(remainder <= 2.0){
                break;
            }
        }

        return remainder;
    }
}