import javax.swing.JFrame;

public class TrafficLightViewer {
    public static void main(String[] args) {
        JFrame window = new JFrame("Window");
        window.setSize(300, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TrafficLightComponent component = new TrafficLightComponent();
        window.add(component);

        window.setVisible(true);
    }
}
