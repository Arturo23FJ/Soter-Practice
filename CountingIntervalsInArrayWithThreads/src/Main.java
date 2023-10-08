public class Main {
    public static void main(String[] args) {
        int[] array = {2, 10, 3, 8, 7, 4, 12, 5, 6};
        IntervalCountRunnable icr1 = new IntervalCountRunnable(array, 0, 2, 1);
        IntervalCountRunnable icr2 = new IntervalCountRunnable(array, 3, 5, 2);
        IntervalCountRunnable icr3 = new IntervalCountRunnable(array, 6, 8, 3);

        Thread t1 = new Thread(icr1);
        Thread t2 = new Thread(icr2);
        Thread t3 = new Thread(icr3);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        }catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }

    }
}