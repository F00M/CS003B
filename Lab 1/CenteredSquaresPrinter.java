import java.awt.Rectangle;

public class CenteredSquaresPrinter {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(100, 100, 200, 200);
        System.out.println(rectangle);

        rectangle.grow(-50, -50);
        System.out.println(rectangle);
    }
}