/*
A software company recruits students based on their CGPA.
 The HR department
classifies applicants into different recruitment categories.

Develop a Java application that accepts a student's CGPA and displays the

recruitment category according to the following criteria:

CGPA Category -->
9.0 – 10.0 Excellent
8.0 – 8.99 Very Good
7.0 – 7.99 Good
6.0 – 6.99 Average
Below 6.0 Needs Improvement
Use an if-else-if ladder.

Input-->
CGPA 

Sample Input-->
Enter CGPA : 8.72


Sample Output-->
== RECRUITMENT REPORT ==
CGPA : 8.72
Performance Category : Very Good */
import java.util.Scanner;
public class problem18 
{
    public static void main(String[]args)
    {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter CGPA : ");
            double cgpa = sc.nextDouble();

            System.out.println("\n== RECRUITMENT REPORT ==\n");
            System.out.println("CGPA : " + cgpa);

            if(cgpa >= 9.0 && cgpa <= 10.0)
            {

                System.out.println("Performance Category : Excellent");
            }
            else if(cgpa >= 8.0 && cgpa < 9.0)
            {
                System.out.println("Performance Category : Very Good");
            }
            else if(cgpa >= 7.0 && cgpa < 8.0)
            {
                System.out.println("Performance Category : Good");
            }
            else if(cgpa >= 6.0 && cgpa < 7.0)
            {
                System.out.println("Performance Category : Average");
            }
            else
            {
                System.out.println("Performance Category : Needs Improvement");
            }
    

        

    }
}
