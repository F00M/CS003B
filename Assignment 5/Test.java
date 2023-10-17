public class Test {
    private static void testCases(Puzzle1089 x) {
        System.out.printf("Input: %d\n", x.getOriginal());
        System.out.printf("Reverse: %d\n", x.getOriginalR());
        System.out.printf("Difference: %d\n", x.getDifference());
        System.out.printf("Reverse: %d\n", x.getDifferenceR());
        System.out.printf("Sum: %d\n", x.getSum());
    }
    public static void main(String[] args) {
        Puzzle1089 test1 = new Puzzle1089(371);
        Puzzle1089 test2 = new Puzzle1089(285);
        Puzzle1089 test3 = new Puzzle1089(650);
        Puzzle1089 test4 = new Puzzle1089(189);

        testCases(test1);
        System.out.println();
        testCases(test2);
        System.out.println();
        testCases(test3);
        System.out.println();
        testCases(test4);
    }
}
