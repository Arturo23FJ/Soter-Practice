import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        multiplicationTableForANumber();
    }

    public static void multiplicationTableForANumber(){
        System.out.println("Please enter a number!");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int index = 1;

        while (index <= 10){
            System.out.println(index + " * " + number + " = " + index * number);
            ++index;
        }
    }
}