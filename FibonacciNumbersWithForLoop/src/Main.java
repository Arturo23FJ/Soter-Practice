public class Main {
    public static void main(String[] args) {
        fibonacciNumbers();
    }

    public static void fibonacciNumbers() {
        int firstNumber = 0;
        int secondNumber = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(firstNumber);
            int sumOfFirstAndSecond = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sumOfFirstAndSecond;
        }
    }
}