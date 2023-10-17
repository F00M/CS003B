import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Draws three stars aligned horizontally
 */
public class StarComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Star left = new Star(getWidth()/2 - 30, getHeight()/2);
        Star middle = new Star(getWidth()/2, getHeight()/2);
        Star right = new Star(getWidth()/2 + 30, getHeight()/2);

        left.draw(g2);
        middle.draw(g2);
        right.draw(g2);
    }
}
