import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

/**
 * This component draws two car shapes
 */
public class CarComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Car car1 = new Car((getWidth() / 2) - 30, (getHeight() / 2) - 15, 1);
        Car car2 = new Car((getWidth() / 2) - 90, (getHeight() / 2) - 15, 1);
        Car car3 = new Car((getWidth() / 2) + 30, (getHeight() / 2) - 15, 1);
        Car car4 = new Car((getWidth() / 2) - 60, (getHeight() / 2) + 30, 2);

        car1.draw(g2, Color.YELLOW);
        car2.draw(g2, Color.RED);
        car3.draw(g2, Color.WHITE);
        car4.draw(g2, Color.BLACK);
    }
}
