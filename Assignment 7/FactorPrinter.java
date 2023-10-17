/**
 * Name: Lieu, Nathan
 * Email: nlieu2@go.pasadena.edu
 * 
 * Input: number
 * Output: factors
 * Processing: factors of number
 */


import java.util.Scanner;

public class FactorPrinter {
    public static void main(String[] args) {
        int input = 0;

        Scanner n = new Scanner(System.in);

        while (true) {
            System.out.print("Enter: ");
            
            if (n.hasNextInt()) {
                input = n.nextInt();
                break;
            }
            n.nextLine();
        }

        FactorGenerator generator = new FactorGenerator(input);

        while (generator.hasMoreFactors()) {
            int next = generator.nextFactor();

            if (generator.hasMoreFactors()) {
                System.out.printf("%d, ", next);
            }
            else {
                System.out.println(next);
            }
        }

        n.close();
    }
}

/**
 * Sample output 1:
 * Enter: -60
 * -2, 2, 3, 5
 * 
 * Sample output 2:
 * Enter: 123456
 * 2, 2, 2, 2, 2, 2, 3, 643
 */