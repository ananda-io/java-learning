/*
A school has introduced a digital system to store students' marks in a single
subject. The class teacher wants a Java application to record the marks of all
students and display them in the order they were entered.
Develop a Java application that declares a single-dimensional array to store
student marks. Read the marks of all students, store them in the array, and display
the complete list of marks.

Input-->
Number of Students
Marks of Each Student

Sample Input-->
Enter Number of Students : 5
Enter Marks:
78
85
91
67
88

Sample Output
==STUDENT MARKS ==
Student 1 : 78
Student 2 : 85
Student 3 : 91
Student 4 : 67
Student 5 : 88 */
import java.util.Scanner;
public class problem24 
{
    public static void main(String[]args)
    {
            Scanner sc = new Scanner(System.in);
            int n;
            System.out.println("enter the no of students : ");
            n = sc.nextInt();
            int marks[] = new int[n];
            System.out.println("Enter marks : ");
            for(int i=0; i<n ; i++)
            {
                    marks[i]=sc.nextInt();
   
            }System.out.println("==STUDENT MARKS ==");
            for(int i=0;i<n;i++)
            {
                    System.out.println("student "+ (i+1)+ " : "+marks[i]);
            }
    }
}
