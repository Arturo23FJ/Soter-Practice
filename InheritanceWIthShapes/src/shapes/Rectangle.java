package shapes;

public class Rectangle implements Shape{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return this.a * this.b;
    }

    public double perimeter(){
        return 2 * (this.a + this.b);
    }

    public String whatAmI(){
        return "I am the " + this.getClass().getSimpleName();
    }
}
