package shapes;

public class Circle implements Shape{
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double area(){
        return Math.pow(this.r, 2) * Math.PI;
    }

    public double perimeter(){
        return 2 * this.r * Math.PI;
    }

    public String whatAmI(){
        return "I am the " + this.getClass().getSimpleName();
    }
}
