import java.util.Random;

public class LotteryPrinter {
    public static void main(String[] args) {
        Random randomNumber = new Random();

        int num1 = randomNumber.nextInt(49);
        int num2 = randomNumber.nextInt(49);
        int num3 = randomNumber.nextInt(49);
        int num4 = randomNumber.nextInt(49);
        int num5 = randomNumber.nextInt(49);
        int num6 = randomNumber.nextInt(49);

        System.out.println("Play this combination - it'll make you rich!");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);

    }
}
