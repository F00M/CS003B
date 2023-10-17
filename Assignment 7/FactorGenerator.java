/**
 * This class generates all the factors of a number
 */
public class FactorGenerator {
    private int factor;
    private int number;
    /**
     * Creates a FactorGenerator obejct used to determine the
     * factor of an input value
     * @param aNum -> input value
     */
    public FactorGenerator(int aNum) {
        number = aNum;
        factor = 0;
    }

    /**
     * Determine whether or not there are more factors
     * @return true -> more factors
     */
    public boolean hasMoreFactors() {
        if (number < 0) {
            for (int i = -2; i >= number; i--) {
                if (number % i == 0) {
                    return true;
                }
            }
        }
        else {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Calculate the enxt factor of a value
     * @return factor -> next factor
     */
    public int nextFactor() {
        if (number < 0) {
            for (int i = -2; i >= number; i--) {
                if (number % i == 0) {
                    factor = i;
                    number /= factor;
                    break;
                }
            }
        }
        else {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    factor = i;
                    number /= factor;
                    break;
                }
            }
        }

        return factor;
    }
}