/*
A university announces examination results based on both theory and laboratory
examinations.
 A student is declared Pass only if:

Theory Marks are 35 or above

Practical Marks are 35 or above

If both conditions are satisfied, the university further checks whether the total
marks are 150 or above to award a Distinction.
Develop a Java application using nested if statements.

Input -->
Theory Marks
Practical Marks
Total Marks

Sample Input-->
Theory Marks : 78
Practical Marks : 74
Total Marks : 162

Sample Output-->
==RESULT ==
Theory : PASS
Practical : PASS
Result : DISTINCTION */

import java.util.Scanner;
public class problem17 
{
    public static void main(String[]args)
    {
       
            Scanner sc =new Scanner(System.in);

            System.out.print ("Enter theory marks : ");
            int tm = sc.nextInt();

            System.out.print("Enter practical marks: ");
            int pm = sc.nextInt();
            int total = pm + tm ;
            System.out.println("==RESULT ==");
            
            if(tm >= 35 && pm >= 35)
            {
                    System.out.println(" THEORY PASS");
                    System.out.println(" PRACTICAL PASS");
                    if(total >= 150)
                    {
                         System.out.println("DISTINCTION ");
                    }
                     else
                    {
                     System.out.println("PASS");
                    }
            }else
            {
                System.out.println("FAILED");
            }

    }
}
