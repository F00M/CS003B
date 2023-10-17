import java.util.Scanner;

public class TipTest {
    public static void main(String[] args) {
        int satisfaction = 0;
        boolean valid = false;
        double total = -1;

        Scanner n = new Scanner(System.in);
        TipCalculator tip = new TipCalculator();

        while (!valid) {
            System.out.print("Enter amount: ");
            if (!n.hasNextDouble()) {
                n.nextLine();
                System.out.println("Invalid input! Please try again.\n");
                continue;
            }
            total = n.nextDouble();

            if (total > TipCalculator.ERRORAMOUNT || total < 0) {
                System.out.println("Error: Bill amount is out of range! Please try again.\n");
                continue;
            }
            else if (total > TipCalculator.WARNINGAMOUNT) {
                System.out.println("Warning: Bill amount is higher than normal.\n");
            }
            
            System.out.print("\nSatisfaction level: ");
            System.out.println("- - - - - - - - -");
            System.out.println("1 - totally satisfied");
            System.out.println("2 - satisfied");
            System.out.println("3 - not satisfied");
            System.out.println("- - - - - - - - -");
            System.out.print("choice: ");
            if (!n.hasNextInt()) {
                n.nextLine();
                System.out.println("Invalid input! Please try again.\n");
                continue;
            }
            satisfaction = n.nextInt();

            if (!(satisfaction > 0 && satisfaction < 4)) {
                System.out.println("Error: Invalid input!\n");
                continue;
            }
            valid = true;
        }

        tip.setSatisfationlevel(satisfaction);
        tip.calculateTip(total);

        System.out.printf("\n\nReceipt:\n- - - - - - - - - - - - - - -\nSubtotal: %.2f\n%s----------\nTotal: %.2f\n- - - - - - - - - - - - - - -", total, tip.toString(), total+tip.getTip());

        n.close();
    }
}
