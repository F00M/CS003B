import java.util.ArrayList;

/**
 * ShoppingCart class represents a cart that stores books
 * the customer is planning on buying
 */
public class ShoppingCart {
    //vars
    ArrayList<Book> cart;
    /**
     * Default constructor
     */
    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    /**
     * Adds a book object to the cart
     * @param b book object
     */
    public void addToCart(Book b) {
        cart.add(b);
    }

    /**
     * Removes an object from the cart
     * @param b book object
     */
    public void removeFromCart(Book b) {
        cart.remove(b);
    }

    /**
     * Get the contents of the cart
     * @return ArrayList<Book>
     */
    public ArrayList<String> getCart() {
        ArrayList<String> names = new ArrayList<>();
        for (Book b : cart) {
            names.add(b.getBookTitle());
        }

        return names;
    }

    /**
     * Clears the contents of the cart
     */
    public void clearCart() {
        cart.clear();
    }
}
