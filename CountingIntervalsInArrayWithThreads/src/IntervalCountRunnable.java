public class IntervalCountRunnable implements Runnable{

    int[] array;
    int startIndex;
    int endIndex;
    int threadNumber;
    int sum = 0;

    public IntervalCountRunnable(int[] array, int startIndex, int endIndex, int threadNumber) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = startIndex; i <= endIndex; i++) {
            sum += array[i];
        }
        System.out.println("Average of numbers in thread number "
                + threadNumber + ": " + getAverage(Math.abs(endIndex - startIndex) + 1, sum));
    }

    public double getAverage(int difference, int sum){
        return (double) sum / difference;
    }
}
