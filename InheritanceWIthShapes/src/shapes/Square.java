package shapes;

public class Square implements Shape{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double area(){
        return a * a;
    }

    public double perimeter(){
        return 4 * a;
    }

    public String whatAmI(){
        return "I am the " + this.getClass().getSimpleName();
    }
}
