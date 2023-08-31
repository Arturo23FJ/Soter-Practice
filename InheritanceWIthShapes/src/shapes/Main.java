package shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        Square square = new Square(5);
        Circle circle = new Circle(5);

        System.out.println(rectangle.whatAmI() + ", my area is " + rectangle.area() + ", my perimeter is " + rectangle.perimeter());
        System.out.println(square.whatAmI() + ", my area is " + square.area() + ", my perimeter is " + square.perimeter());
        System.out.println(circle.whatAmI() + ", my area is " + circle.area() + ", my perimeter is " + circle.perimeter());
    }
}