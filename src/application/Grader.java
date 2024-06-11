package application;

public class Grader {
    public char determineLetterGrade(int numberGrade) {
        if (numberGrade < 0) {
            throw new IllegalArgumentException("BURRO");
        } else if (numberGrade < 60) {
            return 'A';
        } else if (numberGrade < 70) {
            return 'B';
        } else if (numberGrade < 80) {
            return 'C';
        } else  {
            return 'D';

        }
    }
}