/**
 * Stores & manages customer info
 *  - name
 *  - contact (phone #)
 *  - address
 */
public class Customer {
    //vars
    private String name;        // name of customer
    private String phone;       // custtomer phone number
    private String address;     // customer address
    private int discountAmount; // discount customer has

    /**
     * Default constructor
     */
    public Customer() {
        name = "N/A";
        phone = "N/A";
        address = "N/A";
        discountAmount = 0;
    }

    /**
     * Constructs an object with a name, phone, and address
     * @param name
     * @param phone
     * @param address
     */
    public Customer(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    /**
     * Constructs an object with a name, phone, address, and discount
     * @param name customer name (first last)
     * @param phone customer phone (###-###-####)
     * @param address customer address
     * @param discountAmount amount of discount applied to customer
     */
    public Customer(String name, String phone, String address, int discountAmount) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.discountAmount = discountAmount;
    }

    /**
     * Set the name of the customer
     * @param name customer name (first last)
     */
    public void setCustomerName(String name) {
        this.name = name;
    }
    
    /**
     * Set the phone number of the customer
     * @param phone customer phone (###-###-####)
     */
    public void setCustomerPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Set the address of the customer
     * @param address customer address
     */
    public void setCustomerAddress(String address) {
        this.address = address;
    }

    /**
     * Set the discount of the customer
     * @param amount discount
     */
    public void setDiscountamount(int amount) {
        discountAmount = amount;
    }

    /**
     * Get the name of the customer
     * @return customer name (String)
     */
    public String getCustomerName() {
        return name;
    }

    /**
     * Get the phone number of the customer
     * @return customer phone number (String)
     */
    public String getCustomerPhone() {
        return phone;
    }

    /**
     * Get the address of the customer
     * @return customer address (String)
     */
    public String getCustomerAddress() {
        return address;
    }

    public String toString() {
        return String.format("Name: %s\nPhone: %s\nAddress: %s\nDiscount: %d\n", name, phone, address, discountAmount);
    }
}