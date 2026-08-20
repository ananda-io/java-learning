/*A weather monitoring station stores temperature and humidity values as text
received from digital sensors. The system must convert these text values into
numeric form before displaying the weather report.

Develop a Java application that:
Accepts temperature and humidity as String values.
Converts them into double values using the Double Wrapper Class.
Displays the converted values.

Sample Input
Temperature : 32.75
Humidity : 68.50

Sample Output
== WEATHER REPORT ==
Temperature : 32.75 °C
Humidity : 68.50 %
*/
import java.util.Scanner;
public class problem13
{
   public static void main(String[]args)
   {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter temperature : ");
            String temp = sc.nextLine();
             

            System.out.print("Enter humidity : ");
            String humi = sc.nextLine();

            double i = Double.parseDouble(temp);
            double j = Double.parseDouble(humi);

            System.out.println("== WEATHER REPORT ==");
            System.out.println("temperature : " + i + "°C");
            System.out.println("humidity : " + j + "%");
        






    } 
}
