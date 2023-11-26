import java.util.concurrent.Callable;

public class Formula1 implements Callable<Double> {

    double a;
    double b;

    Formula1(double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public Double call() throws Exception{
        return (a + b) / 3;
    }
}
