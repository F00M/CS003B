import java.time.LocalDate;
import java.util.Calendar;

/**
 * Payment class validates credit cards and cash payments
 */
public class Payment {
    //consts
    public final static int AMEX_START = 3;
    public final static int VISA_START = 4;
    public final static int MASTERCARD_START = 5;
    public final static int DISCOVER_START = 6;

    /**
     * Default constructor
     */
    public Payment() {

    }

    private String checkTypeCard(String cardNum) {
        switch (Integer.valueOf(cardNum.substring(0, 0))) {
            case AMEX_START:
                if (Integer.valueOf(cardNum.substring(1, 1)) == 4 || Integer.valueOf(cardNum.substring(1, 1)) == 7) {
                    return "AMEX";
                }
                break;
            case VISA_START:
                return "VISA";
                break;
            case MASTERCARD_START:
                return "MASTERCARD";
                break;
            case DISCOVER_START:
                return "DISCOVER":
                break;
            default:
                break;
        }

        return "Invalid";
    }

    /**
     * Validates credit cards
     * @param cardNum card number
     * @param expDate expiration date of card
     * @return True: card valid | False: card invalid
     */
    public boolean validateCard(String cardNum, Calendar expDate) {
        if (16 < cardNum.length() || cardNum.length() < 15) {
            return false;
        }
        try {
            Long.parseLong(cardNum);
        } catch (NumberFormatException exception) {
            return false;
        }

        if (!expDate.after(LocalDate.now())) {
            return false;
        }

        return true;

    }

    /**
     * Validates cash payments
     * @param amountPaid amount paid by customer
     * @param amountDue amount due from customer
     * @return negative: cash change | positive: not enough cash | exact: no change needed
     */
    public double validateCash(double amountPaid, double amountDue) {
        if (amountPaid > amountDue) {
            return amountPaid - amountDue;
        }
        else if (amountDue > amountPaid) {
            return amountDue - amountPaid;
        }
        else {
            return 0.0;
        }
    }
}
