import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FormulaHandler {

    public static double formulaCounter(double a, double b, double c){
        double result = 0;

        ExecutorService es = Executors.newCachedThreadPool();
        Future<Double> ft1 = es.submit(new Formula1(a, b));
        Future<Double> ft2 = es.submit(new Formula2(c));
        Future<Double> ft3 = es.submit(new Formula3(a, b, c));

        try{
            result = ft1.get() * ft2.get() / ft3.get();
        }catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }catch (ExecutionException ee){
            System.out.println(ee.getMessage());
        } finally {
            es.shutdown();
        }
        return result;
    }
}
