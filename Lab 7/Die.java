import java.util.Random;

/**
 * A die that will get tossed
 */
public class Die {
    private int sides;
    private Random generator;

    /**
     * Default Constructor
     */
    public Die() {
        sides = 0;
    }

    /**
     * Constructor with number of sides
     * @param sides number of sides on die
     */
    public Die(int numSides) {
        sides = numSides;
    }

    /**
     * sets number of die sides
     * @param sides number of sides on die
     */
    public void setSides(int numSides) {
        sides = numSides;
    }

    /**
     * simulates rolling a die
     * @return number that die landed on
     */
    public int roll() {
        generator = new Random();
        return generator.nextInt(sides) + 1;
    }
}