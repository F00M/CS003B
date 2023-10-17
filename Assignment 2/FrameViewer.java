import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameViewer extends JFrame{
    public static void main(String[] args) {
        Color paleGreen = new Color(152, 251, 152);
        JFrame frame = new JFrame();
        frame.setSize(1280, 720);

        // System.out.println(new File("Image1.jpeg").exists());
        ImageIcon image = new ImageIcon("Image1.jpeg");
        JLabel picture = new JLabel(image);
        picture.setBounds(690, 10, image.getIconWidth(), image.getIconHeight());
        frame.add(picture);

        JLabel label = new JLabel("Hello, Nathan!"); // "World" -> "Nathan"
        label.setOpaque(true);
        label.setBackground(paleGreen);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
