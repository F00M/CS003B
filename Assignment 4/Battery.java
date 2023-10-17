/**
 * Battery with set charge (in mAh)
 */
public class Battery {
    private double totalCharge; //max charge of battery in mAh
    private double currentCharge; // current charge of battery in mAh

    /**
     * Creates a battery with a charge
     * @param capacity charge
     */
    public Battery(double capacity) {
        totalCharge = capacity;
        currentCharge = totalCharge;
    }
    /**
     * drains battery my given amount
     * @param amount total charge to remove
     */
    public void drain(double amount) {
        currentCharge -= amount;
    }
    /**
     * charges battery to full capacity
     */
    public void charge() {
        currentCharge = totalCharge;
    }
    /**
     * gets the remaining charge in battery
     * @return charge of battery
     */
    public double getRemainingCharge() {
        return currentCharge;
    }
}