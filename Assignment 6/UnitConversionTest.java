/**
 * Lieu, Nathan
 * 
 * input: two units (Strings), 
 *      one value (Double)
 * output: formatted string
 */


import java.util.Scanner;

public class UnitConversionTest {
    /**
     * Checks if the units are compatible with each other
     * @param before original unit
     * @param after unit to convert to
     * @return true/false
     */
    private static boolean checkUnit(String before, String after) {
        if (before.equals("fl. oz") || before.equals("gal")) {
            if (after.equals("ml") || after.equals("l")) {
                return true;
            }
            else {
                return false;
            }
        }

        else if (before.equals("oz") || before.equals("lb")) {
            if (after.equals("g") || after.equals("kg")) {
                return true;
            }
            else {
                return false;
            }
        }

        else if (before.equals("in") || before.equals("ft") || before.equals("mi")) {
            if (after.equals("mm") || after.equals("cm") || after.equals("m") || after.equals("km")) {
                return true;
            }
            else {
                return false;
            }
        }

        else {
            return false;
        }
    }
    public static void main(String[] args) {
        String unit1 = "";           // first unit
        String unit2 = "";           // second unit
        double beforeValue = 0;     // original value

        Scanner n = new Scanner(System.in);
        UnitConversion convert = new UnitConversion();

        while (!checkUnit(unit1, unit2)) {          // loop checks for correct unit
            System.out.print("Convert from: ");
            unit1 = n.nextLine();

            System.out.print("Convert to: ");
            unit2 = n.nextLine();

            System.out.print("Value: ");
            beforeValue = n.nextDouble();
            n.nextLine();
        }

        System.out.println(convert.convert(unit1, unit2, beforeValue));
        n.close();
    }
}

/**
 *  Convert from: gal
    Convert to: kg
    Value: 2.5
    Convert from: gal
    Convert to: ml
    Value: 10
    10.00 gal = 37850.00 ml
 */