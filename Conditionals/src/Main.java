public class Main {
    public static void main(String[] args) {
        System.out.println(checkNegPosZero(-3));
    }

    public static String checkIfEven(int num){
        if(num % 2 == 0){
            return "Even";
        }
        return "Odd";
    }

    public static String checkNegPosZero(int num){
        if(num < 0){
            return "Negative";
        } else if(num > 0){
            return "Positive";
        }
        return "Zero";
    }
}