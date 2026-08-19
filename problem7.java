/*Develop a java program that accepts thr member's namr, weight (kg),height(mts).

calculate the BMI usin the formula :
BMI = weight/ (height* height)

Display all the entred deatails along with the calculated BMI .

Input :
        -> Member Name 
        -> weight
        -> height

*/

import java.util.Scanner;
public class problem7 {
    public static void main (String[]args)
    {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter member name : ");
        String name = sc.nextLine();

        System.out.print("Enter Weight(kgs) : ");
        float weight = sc.nextFloat();

        System.out.print("Enter height(mts) : ");
        float height = sc.nextFloat();

        System.out.println("***FITNESS REPORT***");
        System.out.println("Member Name : " + name);
        System.out.println("Weight : " + weight);
        System.out.println("Height : " + height);
        System.out.printf("BMI :%.2f", (weight/(height* height)));
        sc.close();

    }
    
}

