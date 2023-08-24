public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 0, -4, -10, 5, 8, -2, 23, 10};

        System.out.println(searchGreatestValue(nums));
    }

    public static int searchGreatestValue(int[] array){
        if (array.length == 0){
            return -1;
        }
        int greatest = Integer.MIN_VALUE;
        for(int element : array){
            if(element > greatest){
                greatest = element;
            }
        }
        return greatest;
    }
}