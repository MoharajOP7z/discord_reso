package assigment_2;

import java.util.Scanner;

public class j_a4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Read marks from the user
            System.out.print("Enter the marks: ");
            int marks = scanner.nextInt();
            
            // Calculate the grade based on marks
            char grade;
            if (marks >= 90) {
                grade = 'A';
            } else if (marks >= 80) {
                grade = 'B';
            } else if (marks >= 70) {
                grade = 'C';
            } else if (marks >= 60) {
                grade = 'D';
            } else if (marks >= 50) {
                grade = 'E';
            } else {
                grade = 'F';
            }
            
            // Display the grade
            System.out.println("The grade is: " + grade);
        }
    }
}
/* 

Enter the marks: 78
The grade is: C 

*/