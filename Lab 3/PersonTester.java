
public class PersonTester {
    public static void main(String[] args) {
        Person nathan = new Person("Nathan");
        Person simon = new Person("Simon");
        Person michelle = new Person("Michelle");
        Person emily = new Person("Emily");
        Person george = new Person("George");

        nathan.befriend(simon);
        nathan.befriend(michelle);
        nathan.befriend(george);
        System.out.println("Before: " + nathan.getFriendNames());

        nathan.unfriend(simon);
        nathan.unfriend(george);
        System.out.println("After: " + nathan.getFriendNames());

        nathan.befriend(emily);
        nathan.unfriend(michelle);
        System.out.println("After: " + nathan.getFriendNames());
    }
}
