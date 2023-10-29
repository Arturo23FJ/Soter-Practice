import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        Future<Long> f1 = es.submit(new FactorialCallable((byte)4));

        es.shutdown();
        try{
            System.out.println("Factorial: " + f1.get());
        }catch (ExecutionException ee){
            System.out.println(ee.getMessage());
        }catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }
    }
}