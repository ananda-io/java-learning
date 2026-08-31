/*
ABC Engineering College maintains the marks obtained by students in different
subjects. The examination branch wants a Java application to store and display the
marks of all students in a tabular format.
Develop a Java application that uses a two-dimensional array to store the marks of
students in multiple subjects.
The program should:
Read the number of students and subjects.
Store the marks in a two-dimensional array.
Display the complete marks matrix.
Input
Number of Students
Number of Subjects
Marks of each student in every subject

Sample Input
Enter Number of Students : 3
Enter Number of Subjects : 4
Student 1 : 78 82 91 75
Student 2 : 85 88 79 92
Student 3 : 69 74 81 80

Sample Output
==STUDENT MARKS MATRIX ==
Student 1 : 78 82 91 75
Student 2 : 85 88 79 92
Student 3 : 69 74 81 80 */
import java.util.Scanner;

public class problem27 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of students and subjects
        System.out.print("Enter Number of Students : ");
        int numStudents = scanner.nextInt();

        System.out.print("Enter Number of Subjects : ");
        int numSubjects = scanner.nextInt();

        // Initialize the 2D array to store marks
        int[][] marksMatrix = new int[numStudents][numSubjects];

        // Store the marks in the 2D array
        for (int i = 0; i < numStudents ; i++) 
        {
        System.out.print("Student " + (i + 1) + " : ");
                for (int j = 0; j < numSubjects; j++) 
                {
                    marksMatrix[i][j] = scanner.nextInt();
                }
        }

        // Display the complete marks matrix
        System.out.println("\n==STUDENT MARKS MATRIX==");
        for (int i = 0; i < numStudents; i++) 
        {
                System.out.print("Student " + (i + 1) + " : ");
                for (int j = 0; j < numSubjects; j++) 
                {
                        System.out.print(marksMatrix[i][j] + " ");
                }
                System.out.println();
        }

        scanner.close();
    }
}
 
    

