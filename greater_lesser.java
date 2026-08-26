//in this program i used if ,if else and else conditional statements 
//so in this program user will input 2 numbers a,b and the system eill give output telling if they are equal , greater or leseer.
import java.util.Scanner;
public class greater_lesser
{
        public static void main(String[]args)
        {
                Scanner sc = new Scanner(System.in);

                System.out.println("ENTER a : ");
                int a = sc.nextInt();

                System.out.println("ENTER b :");
                int b = sc.nextInt();

                if(a==b)
                {
                            System.out.println("BOTH ARE EQUAL ");
                }
                else if(a>b)
                {
                            System.out.println("a IS GREATER ");
                }
                else
                {
                            System.out.println("a IS LESSER");
                }
        }
}