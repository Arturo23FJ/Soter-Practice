public class Main {
    public static void main(String[] args) {
        int[] elements = {-3, 4, 10, 5, -4, 0, 7};

        canBeDividedByTwo(elements);
    }

    public static void canBeDividedByTwo(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                System.out.print(array[i] + ", ");
            }
        }
    }
}