/*
Develop a java application that  acccepts the weights of threee scitific instruments and calculate the total pay load weight
display the individual weights and the total pay load

INPUT :
        -> instrument 1 weight
        -> instrument 2 weight
        -> instument 3 weight

OUTPUT :
        *** PAYLOAD REPORT***
        ->instrument 1 :
        ->instrument 2 :
        ->instrument 3 :
        ->Total Payload :

*/

import java.util.Scanner;
public class problem9 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter instrument 1 weight : ");
        float i1 = sc.nextFloat();

        System.out.print(" Enter instrument 2 weight");
        float i2 = sc.nextFloat();
        
        System.out.print(" Enter instrument 3 weight : ");
        float i3 = sc.nextFloat();

        System.out.println("*** PAYLOAD REPORT");
        System.out.println(" instrument 1 : " + i1);
        System.out.println("instrument 2 : " + i2);
        System.out.println("instrument 3 :" + i3);
        System.out.printf("Total Payload : "+ (i1 + i2 + i3));
        sc.close();

        
    }
}
