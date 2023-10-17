/**
 * Says hello, goodbye, and refueses help to person
 */
public class Greeter {
    private String name;

    /**
     * personalized greeter
     * @param nameOfPerson nome of person
     */
    public Greeter(String nameOfPerson) {
        name = nameOfPerson;
    }

    /**
     * hello person
     * @return basic hello greeting
     */
    public String sayHello() {
        return "Hello, " + name;
    }

    /**
     * goodbye person
     * @return message saying goodbye
     */
    public String sayGoodbye() {
        return "Bye, " + name;
    }

    /**
     * refuse to help
     * @return message refusing to help person
     */
    public String refuseHelp() {
        return "I am sorry, " + name + ". I am afraid I can't do that.";
    }
}
