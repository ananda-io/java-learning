/*
A bank has installed a new ATM that allows customers to withdraw money only
after entering the correct Personal Identification Number (PIN). 

The ATM
compares the entered PIN with the registered PIN and grants access only when
both match.

Develop a Java application that accepts the registered PIN and the PIN entered by
the customer. 
If both PINs are identical, display a welcome message indicating
that the customer can proceed with banking transactions.

Input : -->
Registered PIN
Entered PIN

Sample Input-->
Enter Registered PIN : 4589
Enter Entered PIN : 4589


Sample Output : -->
==ATM LOGIN ==
PIN Verified Successfully.
Welcome to ABC Bank ATM. */
import java.util.Scanner;
public class problem15
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter registered pin : ");
        int reg = sc.nextInt();

        System.out.print("enter entered pin : ");
        int ent = sc.nextInt();
        
        System.out.println("==ATM LOGIN ==");

        if(reg == ent)
        {
            System.out.println("PIN verified ");
            System.out.println("welcome to the ABC bank ATM");
        }else
        {
            System.out.println("--wrong PIN entered--");
        }
        

    }
}
