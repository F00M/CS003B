public class LockTester {
    public static void main(String[] args) {
        UnlockLock lock1 = new UnlockLock(1729, 5714);

        lock1.findTwists();

        System.out.println(lock1);
    }
}
