import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class ColorNameComponent extends JComponent{
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.drawString("Black", 15, 15);

        g2.setColor(Color.blue);
        g2.drawString("Blue", 30, 30);

        g2.setColor(Color.cyan);
        g2.drawString("Cyan", 45, 45);

        g2.setColor(Color.gray);
        g2.drawString("Gray", 60, 60);

        g2.setColor(Color.DARK_GRAY);
        g2.drawString("Dark_Gray", 75, 75);

        g2.setColor(Color.LIGHT_GRAY);
        g2.drawString("Light_Gray", 90, 90);

        g2.setColor(Color.green);
        g2.drawString("Green", 105, 105);

        g2.setColor(Color.magenta);
        g2.drawString("Magenta", 120, 120);

        g2.setColor(Color.ORANGE);
        g2.drawString("Orange", 135, 135);

        g2.setColor(Color.pink);
        g2.drawString("Pink", 150, 150);

        g2.setColor(Color.red);
        g2.drawString("Red", 165, 165);

        g2.setColor(Color.yellow);
        g2.drawString("Yellow", 180, 180);

    }
}
