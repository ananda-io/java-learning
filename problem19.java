
/*A city's metro railway system offers different ticket prices based on the 
passenger's destination zone. 
 
Develop a Java application that accepts the destination zone number and displays 
the corresponding destination and ticket fare using a switch-case statement. 
 
Zone Destination Fare 
1 Central Station ₹20 
2 City Mall ₹35 
3 Airport              ₹60 
4 University ₹40 
5 IT Park              ₹50 
 
Display an appropriate message if the entered zone number is invalid. 
Input 
Destination Zone 
 
Sample Input 
Enter Zone Number : 3 
 
Sample Output 
==METRO TICKET == 
 
Destination : Airport 
Ticket Fare : ₹60 */

import java.util.Scanner ;
public class problem19 
    
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print("ENTER ZONE NUMBER : ");
        int zone = sc.nextInt();

        System.out.println("==METRO TICKET==");
        switch(zone)
        {
            case 1 :
                    System.out.println("DESTINATION : CENTRAL STATION");
                    System.out.println("TICKET FARE : ₹20");
                break;
            case 2 :          
                    System.out.println("DESTINATION : CITY MALL");
                    System.out.println("TICKET FARE : ₹35");
                break;
            case 3 :
                    System.out.println("DESTINATION : AIRPORT");
                    System.out.println("TICKET FARE : ₹60");
                break;
            case 4 :
                    System.out.println("DESTINATION : UNIVERSITY"); 
                    System.out.println("TICKET FARE : ₹40");
                break;
            case 5 :
                    System.out.println("DESTINATION : IT PARK");
                    System.out.println("TICKET FARE : ₹50");
                break;
            default :
                    System.out.println("INVALID ZONE NUMBER");
                break;  

        }
    }
}