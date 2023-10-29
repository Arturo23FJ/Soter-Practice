import java.util.concurrent.Callable;

public class FactorialCallable implements Callable<Long> {

    Byte limit;

    public FactorialCallable(Byte limit) {
        this.limit = limit;
    }

    @Override
    public Long call() throws Exception {
        long result = 1;
        for (int i = 1; i <= limit; i++) {
            result *= i;
        }
        return result;
    }
}
