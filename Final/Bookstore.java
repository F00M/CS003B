import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;

/**
 * Represents an online bookstore
 */
public class Bookstore {
    //consts
    public static String CUSTOMER_FILE_NAME = "Customers.xml";

    //vars
    private Inventory inventory;
    private ArrayList<Customer> customers;
    private ArrayList<Order> orders;

    /**
     * Default constructor
     */
    public Bookstore() {
        inventory = new Inventory();
        customers = getContents();
        orders = new ArrayList<>();
    }

    private ArrayList<Customer> getContents() {
        ArrayList<Customer> c = new ArrayList<>();
        try {
            DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = db.parse(new File(CUSTOMER_FILE_NAME));
            doc.normalize();
            
            NodeList elementNodes = doc.getElementsByTagName("customer");
            for (int i = 0; i < elementNodes.getLength(); i++) {
                Node attributeNode = elementNodes.item(i);

                String name = "", phone = "", address = "", discount = "";
                if (attributeNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) attributeNode;
                    
                    name = e.getElementsByTagName("name").item(0).getTextContent();
                    phone = e.getElementsByTagName("phone").item(0).getTextContent();
                    address = e.getElementsByTagName("address").item(0).getTextContent();
                    discount = e.getElementsByTagName("discount").item(0).getTextContent();
                }
    
                c.add(new Customer(name, phone, address, Integer.valueOf(discount)));
            }
        }
        catch (ParserConfigurationException | FactoryConfigurationError | SAXException | IOException e){
            System.out.println("File load error error");
        }

        return c;
    }

    /**
     * Register customer
     */
    public void registerCustomer(String name, String phone, String address) {
        customers.add(new Customer(name, phone, address));
    }

    public boolean checkExistingCustomer(String phone) {
        for (Customer c : customers) {
            if (c.getCustomerPhone().equals(phone)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Get the list of customers of object Customer
     * @return ArrayList<Customer>
     */
    public Customer getCustomer(String phone) {
        for (Customer c : customers) {
            if (c.getCustomerPhone().equals(phone)) {
                return c;
            }
        }

        return new Customer();
    }

    /**
     * Browses library of books
     */
    public void browseLibrary() {

    }

    /**
     * Adds a book to the customer's shopping cart
     */
    public void addToShoppingCart() {

    }

    /**
     * Places an order
     */
    public void placeOrder() {

    }

    /**
     * Adds a discount for customer
     */
    public void addDiscount() {

    }
}
