/*Develop a java application that accepts the consumers name , previous meter reading, current meter reading and cost per unit
calculate : units consumed
            total electricity bill
calculate units consumed by using the formula
units consumed = current reading - previous reading

calculate total electricity bill by using the formula
Total = UNITS CONSUMED * COST PER UNIT

Display all the entered deatails along with the calculated units consumed and total electricity bill
INPUT
Consumers name
Previous reading
Current reading
Cost per unit

OUTPUT
***ELECTRICITY BILL***
Consumer name
Previous meter reading
Curerent. meter reading
Cost per unit
Units consumed
Total bill
*/

import java.util.Scanner;
public class problem8{
        public static void main(String args[])
        {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Consumer's name : ");
        String name = sc.nextLine();

        System.out.print(" previous reading : ");
        int pr= sc.nextInt();

        System.out.print(" current reading : ");
        int cr = sc.nextInt();

        System.out.print(" cost per unit : ");
        float cost = sc.nextFloat();

        System.out.println("***ELECTRICITY BILL***");
        System.out.println("enter consumer name : " + name);
        System.out.println("enter previous reading : "+ pr);
        System.out.println("enter current reading : " +cr);
        System.out.println("Units used : " + (cr-pr));
        System.out.println("cost per unit :" + cost);
        System.out.println("Total Bill : " + ((cr-pr)*cost ));

        sc.close();
    }
}
