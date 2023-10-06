public class CountingElementRunnable implements Runnable{

    int[] array;
    int sum = 0;
    CountingElementRunnable(int[] array){
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
    }

    public int getSum() {
        return sum;
    }
}
