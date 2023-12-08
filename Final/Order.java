import java.util.ArrayList;

/**
 * Order class represents the checkout process
 */
public class Order {
    //consts
    public static double TAX_PERCENTAGE = 9.5;
    
    //vars
    ArrayList<Book> shoppingCart;
    double total, tax;
    /**
     * Default constructor
     */
    public Order() {
        total = 0.0;
        tax = 0.0;
    }

    /**
     * Creates an object with a shopping cart
     * @param cart shopping cart
     */
    public Order(ArrayList<Book> cart) {
        this();
        shoppingCart = cart;
    }

    /**
     * Set the shopping cart for the order
     * @param cart shopping cart
     */
    public void setShoppingCart(ArrayList<Book> cart) {
        shoppingCart = cart;
    }

    /**
     * Finalize the order
     */
    public void finalizeOrder() {

    }

    /**
     * Calculate the final costs
     * @return double
     */
    public void calcFinalCosts() {
        for (Book b : shoppingCart) {
            total += b.getBookPrice();
        }
        tax *= 1 + (TAX_PERCENTAGE/100);
    }

    /**
     * Clear the contents of the order
     */
    public void clearOrder() {
        shoppingCart.clear();
    }
}
