import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
 * Star shape that can be position anywhere in the window
 */
public class Star {
    private int xCoord; // middle X-Coordinate of star shape
    private int yCoord; // middle Y-Coordinate of the star shape

    /**
     * Creates a star at coords (middleX, middleY)
     * @param middleX X-Coordinate of the star shape
     * @param middleY Y-Coordinatae of the star shape
     */
    public Star(int middleX, int middleY) {
        xCoord = middleX;
        yCoord = middleY;
    }

    /**
     * Draws star
     * @param g2 graphics
     */
    public void draw(Graphics2D g2) {
        // horizontal line of star
        Line2D.Double striaghtVert = new Line2D.Double(xCoord, yCoord+10, xCoord, yCoord-10);
        // vertical line of star
        Line2D.Double straightHoriz = new Line2D.Double(xCoord-10, yCoord, xCoord+10, yCoord);
        // first cross
        Line2D.Double cross1 = new Line2D.Double(straightHoriz.getX1(), striaghtVert.getY1(), straightHoriz.getX2(), striaghtVert.getY2());
        // second cross
        Line2D.Double cross2 = new Line2D.Double(straightHoriz.getX1(), striaghtVert.getY2(), straightHoriz.getX2(), striaghtVert.getY1());

        g2.draw(striaghtVert);
        g2.draw(straightHoriz);
        g2.draw(cross1);
        g2.draw(cross2);
    }
}
