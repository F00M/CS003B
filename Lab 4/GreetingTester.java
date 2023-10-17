public class GreetingTester {
    public static void main(String[] args) {
        // name 1
        Greeter nate = new Greeter("Nathan");
        System.out.println(nate.sayHello());
        System.out.println(nate.sayGoodbye());
        System.out.println(nate.refuseHelp() + "\n\n");

        // name 2
        Greeter Charlie = new Greeter("Charlie");
        System.out.println(Charlie.sayHello());
        System.out.println(Charlie.refuseHelp());
        System.out.println(Charlie.sayGoodbye());
        
    }
}
