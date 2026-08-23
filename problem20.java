/*
A fitness club is organizing a 30-Day Walking Challenge. Every participant
records the number of steps walked each day. The club manager wants a Java
application that calculates the total number of steps walked during the challenge.

Develop a Java application that accepts the number of days and the number of
steps walked each day. 
Use a for loop to calculate the total steps and display the
result.

Input-->
Number of Days
Steps Walked Each Day

Sample Input-->
Enter Number of Days : 5
Day 1 Steps : 5200
Day 2 Steps : 6100
Day 3 Steps : 4800
Day 4 Steps : 7000
Day 5 Steps : 5600

Sample Output-->
==FITNESS REPORT ==
Total Days : 5
Total Steps Walked: 28700
 */
import java.util.Scanner;
public class problem20
{
    public static void main(String[]args)
    {       
            int total = 0;
            
            System.out.println("enter number of days : ");
            Scanner sc = new Scanner(System.in);
            int nd = sc.nextInt();
            for(int i=0 ;i<nd ; i++)
            {
                    System.out.print("Day " + (i+1) + "steps: ");
                    int steps =sc.nextInt();
                    total = total + steps;
            }
            System.out.println("==FITNESS REPORT ==");
            System.out.println("Total days; " + nd);
            System.out.println("Total steps walked: "+ total);

    }
}
