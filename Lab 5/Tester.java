import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tester {
    public static void main(String[] args) {
        String input1, input2;                  //input1 -> required, input2 -> received
        double required, received;
        Scanner n = new Scanner(System.in);

        input1 = JOptionPane.showInputDialog("Enter price: ");
        required = Double.parseDouble(input1);

        input2 = JOptionPane.showInputDialog("Enter Paid: ");
        received = Double.parseDouble(input2);

        GiveChange due1 = new GiveChange(required, received);
        due1.calculateChange();
        JOptionPane.showMessageDialog(null, due1.toString());

        n.close();
    }
}
