import javax.swing.JFrame;

public class ColorNameViewer {
    public static void main(String[] args) {
        JFrame window = new JFrame("window");
        window.setSize(1280, 720);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ColorNameComponent component = new ColorNameComponent();
        window.add(component);

        window.setVisible(true);
    }
}
