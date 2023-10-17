public class BatteryTest {
    public static void main(String[] args) {
        Battery battOne = new Battery(2000);

        System.out.println(battOne.getRemainingCharge());
        battOne.drain(1500);
        System.out.println(battOne.getRemainingCharge());
        battOne.charge();
        System.out.println(battOne.getRemainingCharge());
    }    
}
