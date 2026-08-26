//taking input from the user as age and telling them they are adult or not.
import java.util.Scanner;
public class class3
{
        public static void main(String[]args)
        {
                Scanner sc = new Scanner(System.in);

                System.out.println("ENTER YOUR AGE :");
                int age = sc.nextInt();

                if(age>18)
                {
                        System.out.println("YOU ARE AN ADULT");
                }
                else
                {
                        System.out.println("YOU ARE NOT AN ADULT");
                }

        }
}

//

