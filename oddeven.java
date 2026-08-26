// in this code iam asking user to give a number has input and output tells the user whether the number is odd or even .
import java.util.Scanner;
public class oddeven
{
        public static void main(String[]args)
        {
                Scanner sc = new Scanner(System.in);

                System.out.println("ENTER AN NUMBER : ");
                int num = sc.nextInt();

                if(num%2==0)
                {
                        System.out.println("EVEN!!");
                }
                else
                {
                        System.out.println("ODD!!");
                }
        }
}