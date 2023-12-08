/**
 * A Book Representation
 *  - ID
 *  - Title
 *  - Author
 *  - Genre
 *  - Price
 *  - Availability
 */
public class Book {
    //vars
    private int id;                 // book ID
    private String title;           // book title
    private String author;          // book author
    private String genre;           // book genre
    private double price;           // book price
    private boolean available;      //book availability (true: available; false: not available)

    /**
     * Default constructor
     */
    public Book() {
        id = -1;
        title = "N/A";
        author = "N/A";
        genre = "N/A";
        price = 0.00;
        available = true;
    }

    /**
     * Constructs an object w/ title, author, genre, price, and status of the book
     * @param title book title
     * @param author book author
     * @param genre book genre
     * @param price book price
     * @param status book availability
     */
    public Book(int id, String title, String author, String genre, double price, boolean status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        available = status;
    }

    /**
     * Set the ID of the book
     * @param id book ID
     */
    public void setBookID(int id) {
        this.id = id;
    }

    /**
     * Set the title of the book
     * @param title book title
     */
    public void setBookTitle(String title) {
        this.title = title;
    }

    /**
     * Set the author of the book
     * @param author book author
     */
    public void setBookAuthor(String author) {
        this.author = author;
    }

    /**
     * Set the genre of the book
     * @param genre book genre
     */
    public void setBookGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Set the price of the book
     * @param price book price
     */
    public void setBookPrice(double price) {
        this.price = price;
    }

    /**
     * Set the availability of the book
     * @param status
     */
    public void setBookAvailability(boolean status) {
        available = status;
    }

    /**
     * Get the price of the book
     * @return double
     */
    public double getBookPrice() {
        return price;
    }

    /**
     * Get the genre of the book
     * @return String
     */
    public String getBookGenre() {
        return genre;
    }

    /**
     * Get the author of the book
     * @return String
     */
    public String getBookAuthor() {
        return author;
    }

    /**
     * Get the title of the book
     * @return String
     */
    public String getBookTitle() {
        return title;
    }

    /**
     * Get the ID of the book
     * @return int
     */
    public int getBookID() {
        return id;
    }

    /**
     * Get the availability of the book
     * @return boolean
     */
    public boolean getBookAvailability() {
        return available;
    }

    /**
     * String representation of the class
     */
    public String toString() {
        return String.format("ID: %d\nTitle: %s\nAuthor: %s\nGenre: %s\nPrice: %.2f\nAvailable: %s\n", id, title, author, genre, price, (available == true) ? "Yes" : "No");
    }
}
