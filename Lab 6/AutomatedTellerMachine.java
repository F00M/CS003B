import java.util.Scanner;

public class AutomatedTellerMachine {
    public static void main(String[] args) {
        String input;
        int remainingAttempts = 3;

        Scanner n = new Scanner(System.in);

        while (remainingAttempts > 0) {
            System.out.print("Enter PIN: ");
            input = n.nextLine();

            if (input.length() < 4 || input.length() > 6) {
                System.out.println("Invalid PIN! Make sure it is between 4 and 6 digits.");
                continue;
            }

            remainingAttempts--;
            if (input.matches("1234")) {
                System.out.println("Your PIN is correct!");
                break;
            }

            else {
                System.out.printf("Wrong PIN! You have %d attempt(s) remaining.\n", remainingAttempts);
            }
        }

        if (remainingAttempts <= 0) {
            System.out.println("Your bank card is blocked!");
        }

        n.close();
    }
}
