/**
 * Simulates 1 million rolls for one die/two dices
 */
public class SimulateDieRoll {
    public final static int CHECKNUM_SINGLEDIE = 4;
    public final static int CHECKNUM_DOUBLEDICE = 24;
    private Die d1, d2;
    private int tries;
    private int wins;
    private int losses;

    /**
     * Default Constructor
     */
    public SimulateDieRoll() {
        tries = 0;
        d1 = new Die();
        d2 = new Die();
    }

    /**
     * Constructor with two inputs
     * @param numSides number of Sides in die
     * @param numTries number of times to roll die
     */
    public SimulateDieRoll(int numSides, int numTries) {
        tries = numTries;
        d1 = new Die(numSides);
        d2 = new Die(numSides);
    }

    /**
     * set number of sides for cube
     * @param numSides number of sides
     */
    public void setSides(int numSides) {
        d1.setSides(numSides);
        d2.setSides(numSides);
    }

    /**
     * set number of tries to roll die
     * @param numTries number of trie
     */
    public void setTries(int numTries) {
        tries = numTries;
    }

    /**
     * rolls a die for a set number of times
     */
    public void singleRoll() {
        wins = 0;
        losses = 0;
        for (int i = 0; i < tries; i++) {
            boolean noMatches = true;
            for (int j = 0; j < CHECKNUM_SINGLEDIE; j++) {
                if (d1.roll() == 6) {
                    noMatches = false;
                    break;
                }
            }
            if (noMatches) {
                losses++;
            }
            else {
                wins++;
            }
        }
    }

    /**
     * rolls two dice for a set number of times
     */
    public void doubleRoll() {
        wins = 0;
        losses = 0;
        for (int i = 0; i < tries; i++) {
            boolean noMatches = true;
            for (int j = 0; j < CHECKNUM_DOUBLEDICE; j++) {
                if (d1.roll() == 6 && d2.roll() == 6) {
                    noMatches = false;
                    break;
                }
            }

            if (noMatches) {
                losses++;
            }
            else {
                wins++;
            }
        }
    }

    /**
     * get number of wins
     * @return total wins
     */
    public int getWins() {
        return wins;
    }

    /**
     * get number of losses
     * @return total losses
     */
    public int getLosses() {
        return losses;
    }

    /**
     * formats string with win percentage
     */
    public String toString() {
        return String.format("Win Percentage: %.2f", ((double)wins / ((double)wins + (double)losses) * 100));
    }
}