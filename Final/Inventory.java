import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Inventory {
    //consts
    public static String INVENTORY_FILE_NAME = "Books.xml";

    //public
    public static ArrayList<Book> library;

    /**
     * Default constructor
     */
    public Inventory() {
        library = getContents();
    }

    public ArrayList<Book> getContents() {
        ArrayList<Book> c = new ArrayList<>();
        try {
            DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = db.parse(new File("Books.xml"));
            doc.normalize();
            
            NodeList elementNodes = doc.getElementsByTagName(INVENTORY_FILE_NAME);
            for (int i = 0; i < elementNodes.getLength(); i++) {
                Node attributeNode = elementNodes.item(i);

                String id = "", title = "", author = "", genre = "", price = "", available = "";
                if (attributeNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) attributeNode;
                    id = e.getAttribute("id");
                    
                    title = e.getElementsByTagName("title").item(0).getTextContent();
                    author = e.getElementsByTagName("author").item(0).getTextContent();
                    genre = e.getElementsByTagName("genre").item(0).getTextContent();
                    price = e.getElementsByTagName("price").item(0).getTextContent();
                    available = e.getElementsByTagName("availability").item(0).getTextContent();
                }
    
                c.add(new Book(Integer.valueOf(id), title, author, genre, Double.valueOf(price), available.equals("true") ? true : false));
            }
        }
        catch (ParserConfigurationException | FactoryConfigurationError | SAXException | IOException e){
            System.out.println("File load error error");
        }

        return c;
    }

    /**
     * Adds an entry into library
     * @param book book object
     */
    public void addBook(Book book) {
        library.add(book);
    }

    /**
     * Removes an entry from the library
     * @param book book object
     */
    public void removeBook(Book book) {
        library.remove(book);
    }

    /**
     * Updates a certain property of the book
     * 1 - title
     * 2 - author
     * 3 - genre
     * 4 - price
     * 5 - availability
     * @param subject property to update
     * @param newValue new value of property
     */
    public void updateBook(int subject, String newValue) {

    }

    /**
     * Searches the library for books
     * @param name name of book
     * @return Book object
     */
    public Book searchLibrary(String name) {
        for (Book b : library) {
            if (b.getBookTitle().equals(name)) {
                return b;
            }
        }

        return new Book();
    }
}
