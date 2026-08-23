/*
A multiplex cinema allows customers to book multiple movie tickets. 
After every
booking, the system asks whether the customer wants to book another ticket.
 The
booking process continues until the customer chooses to stop.
Develop a Java application using a do-while loop to repeatedly accept ticket
bookings and calculate the total number of tickets booked.

Input-->
Customer Name
Number of Tickets
Continue Booking (Y/N)

Sample Input-->
Customer Name : Rahul
Tickets : 3
Continue (Y/N) : Y
Customer Name : Priya
Tickets : 2
Continue (Y/N) : N

Sample Output-->
==BOOKING SUMMARY ==
Total Customers : 2
Total Tickets : 5
Thank You for Booking. */
import java.util.Scanner;
public class problem22 
{
    public static void main(String[]args)
    {
            Scanner sc = new Scanner(System.in);
            String cbook  ;//to read Y/N
            int tickets;
            int total = 0;
            int p=0;
            do
            {

                System.out.println("Customer Name : ");
                String name = sc.nextLine();

                System.out.println("Tickets : ");
                tickets =sc.nextInt();
                total = total+tickets;
                p++;
                sc.nextLine();//to read blank line(dummy)
                System.out.println("CONTINUE (Y/N) : ");
                cbook = sc.nextLine();

            
                    
            }while(cbook.charAt(0)=='y'|| cbook.charAt(0)=='Y');
            System.out.println("==BOOKING SUMMARY ==");
            System.out.println("Total Customers:  : " + p);
            System.out.println("Total Tickets : " + total);
    }
}
