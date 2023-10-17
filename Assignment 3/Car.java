import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Rectangle;

/**
 * A car shape that can be positioned anywhere on the screen
 */
public class Car {
    private int xLeft;
    private int yTop;
    private int carScale;

    /**
     * Contructs a car with a given top left corner
     * @param x the x-coordinate of the top-left corner
     * @param y the y-coordinate of the top-left corner
     * @param scale scale of the car
     */
    public Car(int x, int y, int scale) {
        xLeft = x;
        yTop = y;
        carScale = scale;
    }

    /**
     * Draws the car
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2, Color color) {
        Rectangle body = new Rectangle(xLeft, yTop + 10, 60 * carScale, 10 * carScale);
        Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft + 10*carScale, yTop + 10 + body.getHeight(), 10 * carScale, 10 * carScale);
        Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft + 40*carScale, yTop + 10 + (body.getHeight()), 10 * carScale, 10 * carScale);

        // The bottom of the front windshield
        Point2D.Double r1 = new Point2D.Double(xLeft + 10*carScale, yTop + body.getHeight());
        // The front of the roof
        Point2D.Double r2 = new Point2D.Double(r1.getX() + 10*carScale, body.getY() - 10*carScale);
        // The rear of the roof
        Point2D.Double r3 = new Point2D.Double(r2.getX() + 20 * carScale, r2.getY());
        // The bottom of the rear windshield
        Point2D.Double r4 = new Point2D.Double(r1.getX() + 40 * carScale, r1.getY());

        Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
        Line2D.Double roofTop = new Line2D.Double(r2, r3);
        Line2D.Double rearWindshield = new Line2D.Double(r3, r4);

        g2.setColor(Color.BLACK);
        g2.draw(frontTire);
        g2.draw(rearTire);

        g2.setColor(color);
        g2.fill(body);
        g2.draw(frontWindshield);
        g2.draw(roofTop);
        g2.draw(rearWindshield);
    }
}
