
public class MicrowaveTester {
    public static void main(String[] args) {
        Microwave mwave = new Microwave();
        mwave.powerLevel(2);
        mwave.increaseTime();
        mwave.increaseTime();

        System.out.println("wave 1: \n" + mwave.startMicrowave());

        mwave.powerLevel(1);
        mwave.resetTime();
        mwave.increaseTime();

        System.out.println("wave 2: \n" + mwave.startMicrowave());
    }
}
