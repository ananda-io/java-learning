/*
A water treatment plant continuously fills a storage tank. The operator records the
quantity of water added during each cycle.
 The process continues until the
required storage capacity is reached.

Develop a Java application that accepts the tank capacity and the quantity of
water added in each cycle. Use a while loop to continue accepting values until the
tank becomes full or exceeds its capacity. 
Display the total water stored.

Sample Input-->
Tank Capacity : 5000
Water Added : 1200
Water Added : 1500
Water Added : 900
Water Added : 400
Water Added : 1100

Sample Output-->
==TANK STATUS ==
Tank Capacity : 5000 Litres
No.of cycles : 5
Water Stored : 5000 Litres
Tank Filled Successfully. */
import java.util.Scanner;
public class problem21
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        int total = 0;

        System.out.println("Enter tank capacity : ");
        int tankcapacity = sc.nextInt();
        int cycle=0;
        while(total < tankcapacity)
        {
              System.out.print("Enter water : " );
              int ltr = sc.nextInt();
              total=total +ltr ;
              cycle++;
        }
        System.out.println("==TANK STATUS ==");
        System.out.println("Tank capacity : " + tankcapacity);
        System.out.println("no.of cycles : " +cycle);
        
        System.out.println("Tank filled successfully");
        

        
    }
}
