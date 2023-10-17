/**
 * Person with a name and list of friends
 */
public class Person {
    private String firstName;
    private String friends = "";

    /**
     * Creates a person with a first name
     * @param name first name 
     */
    public Person(String name) {
        firstName = name;
    }
    
    /**
     * Adds a friend to intance of person class
     * @param p friend name
     */
    public void befriend(Person p) {
        friends += " " + p.getFirstName();
    }

    /**
     * subtracts a friend from instance of person class
     * @param p friend name
     */
    public void unfriend(Person p) {
        friends = friends.replaceFirst(" " + p.getFirstName(), "");
    }

    /**
     * computes friend names
     * @return string of friend names
     */
    public String getFriendNames() {
        return friends;
    }

    /**
     * gets first name of person
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }
}
