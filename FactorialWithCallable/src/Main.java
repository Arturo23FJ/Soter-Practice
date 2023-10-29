import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        Future<Long> f1 = es.submit(new FactorialCallable((byte)1, (byte)4));
        Future<Long> f2 = es.submit(new FactorialCallable((byte)5, (byte)6));

        es.shutdown();
        try{
            System.out.println("Factorial: " + (f1.get() * f2.get()));
        }catch (ExecutionException ee){
            System.out.println(ee.getMessage());
        }catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }
    }
}