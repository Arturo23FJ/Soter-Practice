import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(multiplyWithScanner(100));
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
}