import java.util.Arrays;

public class Main {

    public static <T> T[] swapElements(T[] array, int index1, int index2){
        if(index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length){
            throw new IndexOutOfBoundsException("Given index is greater than the length of the array!");
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

        return array;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 8, 10, 6};
        String[] stringArray = {"apple", "grape", "melon", "peach", "tomato"};
        System.out.println(Arrays.toString(swapElements(intArray, 2, 5)));
        System.out.println();
        System.out.println(Arrays.toString(swapElements(stringArray, 1, 4)));
    }
}