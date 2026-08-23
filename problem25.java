/*
FreshMart supermarket receives the stock quantity of different grocery items
every morning. The store manager wants to calculate the total stock available.
Develop a Java application that stores the quantity of each item in a single-
dimensional array and calculates the total quantity of all items.

Input
Number of Grocery Items
Quantity of Each Item

Sample Input
Enter Number of Items : 4
Item Quantities
150
220
175
90

Sample Output
==INVENTORY REPORT ==
Item 1 : 150
Item 2 : 220
Item 3 : 175
Item 4 : 90
Total Stock Available : 635 */
import java.util.Scanner;
public class problem25 
{
    public static void main(String[]args)
    {
            
            Scanner sc = new Scanner(System.in);
            int n;
            System.out.println("enter the no of items : ");
            n = sc.nextInt();            
            int qty[] = new int[n];
            int tot = 0;
            System.out.println("Enter qty of each item : ");
            for(int i=0; i<n ; i++)
            {
                    qty[i]=sc.nextInt();
                    tot = tot + qty[i];

            }System.out.println("==INVENTORY REPORT ==");
            for(int i=0;i<n;i++)
            {
                    System.out.println("ITEM "+ (i+1)+ " : "+qty[i]);
            }
            System.out.println("total = " + tot);
    }
}
