import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is the student grade calculator!");
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();
        double[] scores = new double[numberOfSubjects];
        double total = 0;

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter the score of subject " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
            total += scores[i];
        }

        double avg = total / numberOfSubjects;
        char grade;

        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg>= 70) {
            grade = 'C';
        } else if (avg >= 60) {
            grade = 'D';
        } else if (avg >= 50){
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Average Score: " + avg);
        System.out.println("Grade: " + grade);
    }
}
