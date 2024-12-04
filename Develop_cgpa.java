
import java.util.Scanner;

public class Develop_cgpa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

               System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

               if (numSubjects <= 0) {
            System.out.println("Invalid number of subjects. Exiting program.");
            return;
        }

               double totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = scanner.nextDouble();

            
          
            }

            totalMarks += marks;
        }

                double averageMarks = totalMarks / numSubjects;
        double cgpa = averageMarks / 25; 
               String grade;
        if (cgpa == 4.00) {
            grade = "A+";
        } else if (cgpa >=3.75) {
            grade = "A";
        } else if (cgpa >=3.50) {
            grade = "A-";
        } else if (cgpa >= 3.00) {
            grade = "B+";
        } else if (cgpa >= 2.75) {
            grade = "C";
        } else {
            grade = "F";
        }

               System.out.printf("Your CGPA is: %.2f%n", cgpa);
        System.out.println("Your grade is: " + grade);

        scanner.close();
    }
}
