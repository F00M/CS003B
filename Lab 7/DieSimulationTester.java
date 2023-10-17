/**
 * Names: Nathan Lieu & Charlie Sanchez Perez
 * 
 * input: none
 * output: win percentages
 * processing: win percentage for one and two dice
 */



public class DieSimulationTester {
    public static void main(String[] args) {
        SimulateDieRoll die1 = new SimulateDieRoll(6, 1000000);

        die1.singleRoll();
        System.out.printf("One Die - %s%%\n", die1);

        die1.doubleRoll();
        System.out.printf("Two Dice - %s%%\n", die1);
    }
}

/**
 * Sample Run 1:
 * One Die - Win Percentage: 51.68%
 * Two Dice - Win Percentage: 49.12%

 * Sample Run 2:
 * One Die - Win Percentage: 51.88%
 * Two Dice - Win Percentage: 49.12%
 */