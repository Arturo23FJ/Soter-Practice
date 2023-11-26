import java.util.concurrent.Callable;

public class Formula2 implements Callable<Double> {

    double c;

    Formula2(double c){
        this.c = c;
    }

    @Override
    public Double call() throws Exception {
        return 8 + c - 32;
    }
}
