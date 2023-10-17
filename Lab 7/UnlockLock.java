/**
 * Finds the minimum turns needed to unlock a lock
 * with a combination
 */
public class UnlockLock {
    private int currentCombination;
    private int keyCombination;
    private int turn1, turn2, turn3, turn4;
    private String dir1, dir2, dir3, dir4;
    String direction;

    /**
     * Default Constructor
     */
    public UnlockLock() {
        currentCombination = 0;
        keyCombination = 0;
        turn1 = 0;
        turn2 = 0;
        turn3 = 0;
        turn4 = 0;
        dir1 = "";
        dir2 = "";
        dir3 = "";
        dir4 = "";
    }

    /**
     * Creates an object used to find the min turns to unlock
     * @param combination -> current position of lock
     * @param key -> combination to unlock lock
     */
    public UnlockLock(int combination, int key) {
        currentCombination = combination;
        keyCombination = key;
        turn1 = 0;
        turn2 = 0;
        turn3 = 0;
        turn4 = 0;
        dir1 = "";
        dir2 = "";
        dir3 = "";
        dir4 = "";
    }

    /**
     * sets the current combination of the lock
     * @param combination -> current position of lock
     */
    public void setCurrentCombination(int combination) {
        currentCombination = combination;
    }

    /**
     * gets the current combination of the lock
     * @return current combination of lock
     */
    public int getCurrentCombination() {
        return currentCombination;
    }

    /**
     * sets the combination to unlock lock
     * @param key -> correct combination
     */
    public void setKey(int key) {
        keyCombination = key;
    }

    /**
     * gets the combination to unlock lock
     * @return correct combination
     */
    public int getKey() {
        return keyCombination;
    }

    /**
     * compute the number of twists needed for each digit
     */
    public void findTwists() {
        int key = 0, current = 0;

        for (int i = 0; i < 4; i++) {
            direction = "";
            key = keyCombination / 1000;
            current = currentCombination / 1000;

            if (key == current) {
                continue;
            }

            if (i == 1) {
                turn1 = findShortestPath(current, key);
                dir1 = direction;
            }
            else if (i == 2) {
                turn2 = findShortestPath(current, key);
                dir2 = direction;
            }
            else if (i == 3) {
                turn3 = findShortestPath(current, key);
                dir3 = direction;
            }
            else {
                turn4 = findShortestPath(current, key);
                dir4 = direction;
            }

            keyCombination %= 1000 / 10^i;
            currentCombination %= 1000 / 10^i;
        }
    }

    /**
     * computes the shortest path to the correct digit
     * @return shortest path
     */
    private int findShortestPath(int x, int y) {
        int count1 = 0, count2 = 0;
        for (int i = x; i != y; i++) {
            count1++;
            if (i == 10) {
                i = 0;
            } 
        }

        for (int i = x; i != y; i--) {
            count2++;
            if (i == -1) {
                i = 9;
            }
        }

        if (count1 == count2) {
            direction = "Twist up and down";
            return count1;
        }
        else if (count1 < count2) {
            direction = "Twist up";
            return count1;
        }
        else {
            direction = "Twist down";
            return count2;
        }
    }

    public String toString() {
        String x = "", y = "", z = "", j = "";
        if (turn1 != 0) {
            x = String.format("Ring 1: %s %d turn(s)\n", dir1, turn1);
        }

        if (turn2 != 0) {
            y = String.format("Ring 2: %s %d turn(s)\n", dir2, turn2);
        }

        if (turn3 != 0) {
            z = String.format("Ring 3: %s %d turn(s)\n", dir3, turn3);
        }

        if (turn4 != 0) {
             j = String.format("Ring 4: %s %d turn(s)\n", dir4, turn4);
        }
        return x + y + z + j;
    }
}
