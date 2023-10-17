import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Rectangle;

public class TranslateDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Your work goes here: Construct a rectangle and set the frame bounds
        Rectangle box = new Rectangle(100, 100, 500, 500);
        frame.setBounds(box);
        JOptionPane.showMessageDialog(frame, "Click OK to continue");
        // Your work goes here: Move the rectangle and set the frame bounds again
        box.translate(600, 100);
        frame.setBounds(box);
    }
}
