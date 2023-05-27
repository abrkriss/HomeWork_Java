package Ex2;

public class Program {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(20,8);
        r1.calculateArea();
        r1.calculatePerimeter();

        Rectangle r2 = new Rectangle();
        r2.calculateArea();
        r2.calculatePerimeter();
    }
}
