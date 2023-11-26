import java.util.concurrent.Callable;

public class Formula3 implements Callable<Double> {

    double a;
    double b;
    double c;

    Formula3(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public Double call() throws Exception {
        return a - b + c;
    }
}
