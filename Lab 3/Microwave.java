/**
 * Microwave with 4 buttons:
 * - Start
 * - Reset time
 * - Set power level
 * - Cooking time
 */
public class Microwave {
    private int time;
    private int level;

    /**
     * Constructs microwave with cooking time at zero
     * and power level at zero
     */
    public Microwave() {
        time = 0;
        level = 0;
    }

    /**
     * increases cooking time by 30 seconds
     */
    public void increaseTime() {
        time += 30;
    }

    /**
     * changes power level of microwave
     * @param microwaveLevel level of microwave (1 or 2)
     */
    public void powerLevel(int microwaveLevel) {
        level = microwaveLevel;
    }

    /**
     * reset cooking timer to zero
     */
    public void resetTime() {
        time = 0;
    }

    /**
     * starts microwave and tells user cooking time and power level
     * @return time and level of microwave
     */
    public String startMicrowave() {
        return "time: " + time + " seconds\nLevel: " + level;
    }
}
