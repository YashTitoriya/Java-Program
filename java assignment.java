import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your test score: ");
        int score = scanner.nextInt();

        char grade;

        if (score >= 0 && score <= 100) {
            if (score >= 90 && score <= 100) {
                grade = 'A';
            } else if (score >= 80 && score < 90) {
                grade = 'B';
            } else if (score >= 70 && score < 80) {
                grade = 'C';
            } else if (score >= 60 && score < 70) {
                grade = 'D';
            } else if (score >= 50 && score < 60) {
                grade = 'E';
            } else {
                grade = 'F';
            }

            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid test score! Please enter a score between 0 and 100.");
        }

        scanner.close();
    }
}





For Switch Statement


public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your test score: ");
        int score = scanner.nextInt();

        char grade;

        if (score >= 0 && score <= 100) {
            switch (score / 10) {
                case 10:
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                case 5:
                    grade = 'E';
                    break;
                default:
                    grade = 'F';
            }

            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid test score! Please enter a score between 0 and 100.");
        }

        scanner.close();
    }
}
