public class Main {
    public static void main(String[] args) {
        System.out.println(checkIfEven(3));
    }

    public static String checkIfEven(int num){
        if(num % 2 == 0){
            return "Even";
        }
        return "Odd";
    }
}