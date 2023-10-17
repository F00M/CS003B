/**
 * Calculates tip based on customer's satisfaction level
 */
public class TipCalculator {
    public final static double TOPSATISFACTION = 20;    // totally satisfied
    public final static double MIDSATISFACTION = 15;    // satisfied
    public final static double LOWSATISFACTION = 10;    // dissatisfied
    public final static double WARNINGAMOUNT = 200;     // threshold before warning
    public final static double ERRORAMOUNT = 400;       // threshold before error

    private int satisfactionLevel;
    private double tip;

    /**
     * Default constructor
     */
    public TipCalculator() {
        satisfactionLevel = 0;
        tip = 0;
    }

    /**
     * constructor with satisfaction level of customer
     * @param levelOfSatisfaction satisfaction level
     */
    public TipCalculator(int levelOfSatisfaction) {
        satisfactionLevel = levelOfSatisfaction;
        tip = 0;
    }

    /**
     * calculate tip
     * @param subTotal subtotal
     */
    public void calculateTip(double subTotal) {
        double tipAmount = 0;

        switch (satisfactionLevel) {
            case 1:
                tipAmount = TOPSATISFACTION;
                break;

            case 2:
                tipAmount = MIDSATISFACTION;
                break;

            case 3:
                tipAmount = LOWSATISFACTION;
                break;
        
            default:
                break;
        }

        tip = subTotal * (tipAmount / 100.0);
    }

    /**
     * gets tip amount
     * @return tip 
     */
    public double getTip() {
        return tip;
    }

    /**
     * set satisfaction level of customer
     *      1: totally satisfied
     *      2: satisfied
     *      3: dissatisfied
     * @param level level of satisfaction
     */
    public void setSatisfationlevel(int level) {
        satisfactionLevel = level;
    }

    /**
     * gets satisfaction level of customer
     * @return satisfaction level
     */
    public int getSatisfactionLevel() {
        return satisfactionLevel;
    }

    /**
     * formats string with satisfaction level and tip
     * @return formatted string
     */
    public String toString() {
        return String.format("Tip: %.2f (level: %d)\n", tip, satisfactionLevel);
    }
}
