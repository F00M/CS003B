/**
 * Converts fl. oz, gal -> ml, l
 *          oz, lb -> g, kg
 *          in, ft, mi -> mm, cm, m, km
 */
public class UnitConversion {
    /**
     * Default constructor
     */
    public UnitConversion() {

    }

    /**
     * Converts the value of one unit to another unit
     * @param x original unit
     * @param y converted unit
     * @param z original value
     * @return string representation of conversion
     */
    public String convert(String x, String y, double z) {
        double value = 0;
        double factor = 0;

        if (x.equals("fl. oz")) {
            if (y.equals("ml")) {
                factor = 29.57;
            }
            else {
                factor = 0.02957;
            }
        }

        else if (x.equals("gal")) {
            if (y.equals("ml")) {
                factor = 3785;
            }
            else {
                factor = 3.785;
            }
        }

        else if (x.equals("oz")) {
            if (y.equals("g")) {
                factor = 28.35;
            }
            else {
                factor = 0.02835;
            }
        }

        else if (x.equals("lb")) {
            if (y.equals("g")) {
                factor = 453.6;
            }
            else {
                factor = 0.4536;
            }
        }

        else if (x.equals("in")) {
            if (y.equals("mm")) {
                factor = 25.4;
            }
            else if (y.equals("cm")) {
                factor = 2.54;
            }
            else if (y.equals("m")) {
                factor = 0.0254;
            }
            else {
                factor = 2.54e-5;
            }
        }

        else if (x.equals("ft")) {
            if (y.equals("mm")) {
                factor = 304.8;
            }
            else if (y.equals("cm")) {
                factor = 30.48;
            }
            else if (y.equals("m")) {
                factor = 0.3048;
            }
            else {
                factor = 3.048e-4;
            }
        }

        else if (x.equals("mi")) {
            if (y.equals("mm")) {
                factor = 1.609e6;
            }
            else if (y.equals("cm")) {
                factor = 160934;
            }
            else if (y.equals("m")) {
                factor = 1609;
            }
            else {
                factor = 1.609;
            }
        }
        value = z * factor;

        return String.format("%.2f %s = %.2f %s", z, x, value, y);
    }
}