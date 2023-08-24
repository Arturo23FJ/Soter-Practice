import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arrayToBeFilled = new int[6];
        System.out.println(Arrays.toString(fillingArrayWithRandomNumbers(arrayToBeFilled)));
    }

    public static int[] fillingArrayWithRandomNumbers(int[] array){
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(-50, 50);
        }
        return array;
    }
}