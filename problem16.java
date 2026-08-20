/*
A university library charges a fine when books are returned after the due date.

The librarian wants a Java application that informs students whether they need to
pay a fine.

Develop a Java program that accepts the number of delayed days. If the number
of delayed days is greater than 0, display that a fine must be paid. Otherwise,
display that no fine is applicable.


Input-->
Number of Delayed Days

Sample Input-->
Enter Delayed Days : 5


Sample Output-->
==LIBRARY REPORT ==
Book Returned After Due Date. 
fine Applicable.
*/

import java.util.Scanner ;
public class problem16 
{
    public static void main(String[]args)
    {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of delayed days : ");
            int delay = sc.nextInt();

            System.out.println("==LIBRARY REPORT ==");

            if(delay > 0)
            {
                    System.out.println("Book Returned After Due Date.");
                    System.out.println("fine is applicable");
                                               
            }else
            {
                    System.out.println("no fine is applicable.");
                                                
            }
            
    }
}
