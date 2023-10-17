/**
 * Calculate and output change
 */
public class GiveChange {
    //set values
    private final static double DOLLARVALUE = 1.00;
    private final static double QUARTERVALUE = 0.25;
    private final static double DIMEVALUE = 0.10;
    private final static double NICKELVALUE = 0.05;
    private final static double PENNYVALUE = 0.01;

    //instance variables
    private double amountDue;
    private double amountReceived;

    //total coins
    private int totalDollars;
    private int totalQuarters;
    private int totalDimes;
    private int totalNickels;
    private int totalPennies;

    /**
     * Default constructor
     */
    public GiveChange() {
        amountDue = 0;
        amountReceived = 0;

        totalQuarters = 0;
        totalDimes = 0;
        totalNickels = 0;
        totalPennies = 0;
        totalDollars = 0;
    }

    /**
     * Constructor passing money owed and money recieved
     * @param owedMoney money that is owed by the customer
     * @param recievedMoney money that was recieved by the cashier
     */
    public GiveChange(double owedMoney, double recievedMoney) {
        amountDue = owedMoney;
        amountReceived = recievedMoney;

        totalQuarters = 0;
        totalDimes = 0;
        totalNickels = 0;
        totalPennies = 0;
        totalDollars = 0;
    }
    
    /**
     * Compute total amount of dollars
     * @param amount total amount of change
     * @return remaining amount of change after subtracting dollars
     */
    private double calculateDollars(double amount) {
        double newChange = amount;

        totalDollars = (int) (newChange / DOLLARVALUE);
        newChange -= totalDollars * DOLLARVALUE;

        return newChange;
    }

    /**
     * Compute total amount of quarters
     * @param amount total amount of change
     * @return remaining amount of change after subtracting quarters
     */
    private double calculateQuarters(double amount) {
        double newChange = amount;

        totalQuarters = (int) (newChange / QUARTERVALUE);
        newChange -= totalQuarters * QUARTERVALUE;

        return newChange;
    }

    /**
     * Compute total amount of dimes
     * @param amount total amount of change
     * @return remaining amount of change after subtracting dimes
     */
    private double calculateDimes(double amount) {
        double newChange = amount;

        totalDimes = (int) (newChange / DIMEVALUE);
        newChange -= totalDimes * DIMEVALUE;

        return newChange;
    }

    /**
     * Compute total amount of nickels
     * @param amount total amount of change
     * @return remaining amount of change after subtracting nickels
     */
    private double calculateNickels(double amount) {
        double newChange = amount;

        totalNickels = (int) (newChange / NICKELVALUE);
        newChange -= totalNickels * NICKELVALUE;

        return newChange;
    }

    /**
     * Set total amount of pennies
     * @param amount remaining amount of change
     */
    private void setPennies(double amount) {
        totalPennies = (int) (amount / PENNYVALUE);
    }

    /**
     * Compute dollars, quarters, dimes, nickels, pennies needed
     * to satisfy the total amount of change
     */
    public void calculateChange() {
        double totalChange = amountReceived - amountDue;

        setPennies(calculateNickels(calculateDimes(calculateQuarters(calculateDollars(totalChange)))));
    }

    /**
     * Creates a string representation of the total amount of 
     * dollars, quarters, dimes, nickels, pennies that was
     * calculated
     */
    public String toString() {
        return "Dollars: " + totalDollars + "\nQuarters: " + totalQuarters + "\nDimes: " + totalDimes + 
        "\nNickels: " + totalNickels + "\nPennies: " + totalPennies;
    }
}
