public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 10};
        CountingElementRunnable ce = new CountingElementRunnable(array);
        Thread t1 = new Thread(ce);

        t1.start();

        try {
            t1.join();
        }catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }

        System.out.println(ce.getSum());
    }
}