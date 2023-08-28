public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 3);
        Rectangle r2 = new Rectangle(-3, 4);

        System.out.println(r1.area());
        System.out.println(r2.perimeter());
    }
}