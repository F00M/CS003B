/**
 * Student with firstName, lastName, ID number, and quiz score
 */
public class Student {
    private String studentFirstName;
    private String studentLastName;
    private int idNumber;
    private double totalquizScore;
    private int numberOfQuizzes;

    /**
     * Constructs a Student with the previous student's ID number
     * @param firstName the first name of the student
     * @param lastName the last name of the student
     * @param lastiDNUmber the ID number of the previous student
     */
    public Student(String firstName, String lastName, int LastiDNumber){
        studentFirstName = firstName;
        studentLastName = lastName;
        totalquizScore = 0;
        numberOfQuizzes = 0;
        setStudentIdNumber(LastiDNumber);
    }
    /**
     * sets current student's ID number to the previous student's ID number plus one
     * @param previousiDNumber the ID number of the previous student
     */
    private void setStudentIdNumber(int previousiDNumber) {
        idNumber = ++previousiDNumber;
    }
    /**
     * Recieves and stores the first and last name of the student
     * @return first name and last name of student
     */
    public String getName() {
        return studentFirstName + " " + studentLastName;
    }
    /**
     * gets id number of student
     * @return ID number of student
     */
    public int getID() {
        return idNumber;
    }
    /**
     * adds a quiz score to total quiz score of student
     * @param score the score of the current quiz
     */
    public void addQuiz(int score) {
        totalquizScore += score;
        numberOfQuizzes++;
    }
    /**
     * computes the total score for the student's quizzes
     * @return the student's total quiz score
     */
    public double getTotalScore() {
        return totalquizScore;
    }
    /**
     * computes the average of all the quiz scores
     * @return the student's average quiz score
     */
    public double getAverageScore() {
        return totalquizScore / numberOfQuizzes;
    }
}
