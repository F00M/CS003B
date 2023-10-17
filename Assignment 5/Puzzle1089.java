/**
 * computes the reverse, sum, and difference of numbers
 */
public class Puzzle1089 {
    private int number;                 // original number
    private int reversedNumber;         // original number reversed
    private int differenceOfNumber;     // reversedNumber - number
    private int reversedDifference;     // differenceOfNumber reversed
    private int sum;                    // differenceOfNumber + reversedDifference

    /**
     * creates Puzzle1089 object
     * @param input original number
     */
    public Puzzle1089(int input) {
        number = removeDigits(input);
        reversedNumber = reverseDigits(number);
        differenceOfNumber = differenceOf(reversedNumber, number);
        reversedDifference = reverseDigits(differenceOfNumber);
        sum = sumOf(differenceOfNumber, reversedDifference);
    }

    /**
     * removes all numnbers except the last three
     * from the input
     * @param x original number
     * @return number with last three digits
     */
    private int removeDigits(int x) {
        return x % 1000;
    }

    /**
     * reverses the number's order
     * @param x number to be reversed
     * @return reversed number
     */
    private int reverseDigits(int x) {
        int reverse;

        reverse = x % 10;
        x /= 10;
        // System.out.println(x);
        reverse *= 10;

        reverse += x % 10;
        x /= 10;
        // System.out.println(x);
        reverse *= 10;

        reverse += x;

        return reverse;
    }

    /**
     * computes the difference of two numbers
     * @param num1 first number
     * @param num2 second number
     * @return the difference (always positive)
     */
    private int differenceOf(int num1, int num2) {
        return Math.abs(num1 - num2);
    }

    /**
     * computes the sum of two numbers
     * @param num1 first number
     * @param num2 second number
     * @return the sum
     */
    private int sumOf(int num1, int num2) {
         return differenceOfNumber + reversedDifference;
    }

    /**
     * get original input
     * @return number variable
     */
    public int getOriginal() {
        return number;
    }

    /**
     * get reversed input
     * @return reversedNumber variable
     */
    public int getOriginalR() {
        return reversedNumber;
    }

    /**
     * get difference of reversedNumber and number
     * @return differenceOfNumber variable
     */
    public int getDifference() {
        return differenceOfNumber;
    }

    /**
     * get reversed of the difference
     * @return reversedDifference variable
     */
    public int getDifferenceR() {
        return reversedDifference;
    }

    /**
     * get sum of differenceOfNumber and reversedDifference,
     * sum should equal to 1089
     * @return sum variable
     */
    public int getSum() {
        return sum;
    }
}
