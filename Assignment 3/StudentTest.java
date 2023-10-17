public class StudentTest {
    public static void main(String[] args) {
        int studentIDNumber = 123456;
        Student Nathan = new Student("Nathan", "Lieu", studentIDNumber);
        studentIDNumber = Nathan.getID();
        Nathan.addQuiz(90);
        Nathan.addQuiz(95);
        Nathan.addQuiz(60);

        System.out.print("First Name Last Name: " + Nathan.getName());
        System.out.println(" | Expected: Nathan Lieu");

        System.out.print("ID Number: " + Nathan.getID());
        System.out.println(" | Expected: 123457");

        System.out.print("Total score: " + Nathan.getTotalScore());
        System.out.println(" | Expected: 245");

        System.out.print("Average score: " + Nathan.getAverageScore());
        System.out.println(" | Expected: 81.667\n");


        Student Banana = new Student("Banana", "Apple", studentIDNumber);
        studentIDNumber = Banana.getID();

        Banana.addQuiz(85);
        Banana.addQuiz(70);
        Banana.addQuiz(10);

        System.out.print("First Name Last Name: " + Banana.getName());
        System.out.println(" | Expected: Banana Apple");

        System.out.print("ID Number: " + Banana.getID());
        System.out.println(" | Expected: 123458");

        System.out.print("Total score: " + Banana.getTotalScore());
        System.out.println(" | Expected: 165");

        System.out.print("Average score: " + Banana.getAverageScore());
        System.out.println(" | Expected: 55");
    }
}
