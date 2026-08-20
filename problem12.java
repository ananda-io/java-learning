/*
Develop a jav aapplication that :
reads two numbers as string values.
Converts them into integers using the integer wrapper class.
calculates and displays their sum.
use the Integer. preseInt()method for conversion.


Sample Input
Enter First Number : 125
Enter Second Number: 275

Sample Output
==CALCULATION REPORT ==
First Number : 125
Second Number : 275
sum : 400
*/
import java.util.Scanner;
public class problem12 
{
    public static void main(String[]args)
    {
            Scanner sc = new Scanner (System.in);

            System.out.println("Enter First number :");
            String num1 = sc.nextLine();
            
            System.out.println("Enter Second number :");
            String num2 = sc.nextLine();

            int i = Integer.parseInt(num1);
            int j = Integer.parseInt(num2);
            int sum = i+ j;

            System.out.println("sum : " + sum);


    }
}

