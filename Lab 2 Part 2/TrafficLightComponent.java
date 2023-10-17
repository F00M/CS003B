import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class TrafficLightComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // border
        Rectangle border = new Rectangle(10, 10, 300, 600);

        // circles
        Ellipse2D.Double circle1 = new Ellipse2D.Double(85, 30, 150, 150);
        Ellipse2D.Double circle2 = new Ellipse2D.Double(85, 235, 150, 150);
        Ellipse2D.Double circle3 = new Ellipse2D.Double(85, 440, 150, 150);

        //draw
        g2.fill(border);

        g2.setColor(Color.RED);
        g2.fill(circle1);

        g2.setColor(Color.YELLOW);
        g2.fill(circle2);

        g2.setColor(Color.GREEN);
        g2.fill(circle3);
    }
}
