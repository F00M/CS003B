import javax.swing.JComponent;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class FaceComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // face
        Ellipse2D.Double faceOutline = new Ellipse2D.Double(10, 10, 300, 300);

        //eyes
        Ellipse2D.Double leftEye = new Ellipse2D.Double(40, 60, 100, 100);
        Ellipse2D.Double rightEye = new Ellipse2D.Double(180, 60, 100, 100);

        //mouth
        Line2D.Double mouth = new Line2D.Double(90, 250, 230, 250);

        //draw
        g2.draw(faceOutline);
        g2.draw(leftEye);
        g2.draw(rightEye);
        g2.draw(mouth);

    }
}
