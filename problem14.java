/*
A digital library receives all member information as text. Before generating
membership cards, the software converts the entered values into appropriate
wrapper objects.

Develop a Java application that:
Read Member ID as a String.
Read Membership Fee as a String.

Convert the Member ID using the Integer Wrapper Class.
Convert the Membership Fee using the Double Wrapper Class.
Display the membership details.

Sample Input
Member ID : 2054
Member Name : Rahul
Membership Fee : 1500.50

Sample Output
== LIBRARY MEMBERSHIP ==
Member ID : 2054
Member Name : Rahul
Membership Fee : ₹1500.50
*/
import java.util.Scanner;
public class problem14
{
    public static void main (String[]args)
    {
                Scanner sc = new Scanner (System.in);

                System.out.print("Enter Member ID : ");
                String id = sc.nextLine();

                System.out.print("Enter Member name : ");
                String name = sc.nextLine();

                System.out.print("Enter Membership fee : ");
                String fee = sc.nextLine();



                int i = Integer.parseInt(id);
                double j = Double.parseDouble(fee);

                System.out.println("== LIBRARY MEMBERSHIP ==");
                System.out.println("Member ID : " + i);
                System.out.println("Member Name : " +name);
                System.out.println("Membership Fee : " + j);
                
    }
    
}
