import javax.swing.JFrame;

public class FaceViewer {
    public static void main(String[] args) {
        JFrame window = new JFrame("window");
        window.setSize(320, 650);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FaceComponent light = new FaceComponent();
        window.add(light);

        window.setVisible(true);
    }
}
