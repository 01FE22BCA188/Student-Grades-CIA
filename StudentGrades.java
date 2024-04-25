import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        
        char[] grades = new char[numStudents];
    
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            int score = scanner.nextInt();
            
            
            if (score >= 90 && score <= 100) {
                grades[i] = 'S';
            } else if (score >= 80 && score < 90) {
                grades[i] = 'A';
            } else if (score >= 65 && score < 80) {
                grades[i] = 'B';
            } else if (score >= 50 && score < 65) {
                grades[i] = 'C';
            } else if (score >= 40 && score <50) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
        
        System.out.println("\nStudent Grades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": " + grades[i]);
        }
        
        
        scanner.close();
    }
}
