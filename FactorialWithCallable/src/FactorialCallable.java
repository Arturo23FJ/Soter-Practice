import java.util.concurrent.Callable;

public class FactorialCallable implements Callable<Long> {

    Byte from;
    Byte until;

    public FactorialCallable(Byte from, Byte until) {
        this.from = from;
        this.until = until;
    }

    @Override
    public Long call() throws Exception {
        long result = 1;
        for (int i = from; i <= until; i++) {
            result *= i;
        }
        return result;
    }
}
