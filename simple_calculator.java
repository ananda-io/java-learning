/*this codes works as a simple calculator i build this using th concept switch case.
in this user first input a value then b value then what opreation they would like to do ,this simple calculator calculates simple 
operations like +,-,*,/,%. */
import java.util.Scanner;
public class simple_calculator
{
        public static void main(String[]args)
        {
                Scanner sc = new Scanner(System.in);

                System.out.println("ENTER a : ");
                int a = sc.nextInt();

                System.out.println("ENTER b : ");
                int b = sc.nextInt();

                System.out.println("ENTER OPERATION : ");
                char op = sc.next().charAt(0);

                switch(op)
                {
                            case '+':
                                    System.out.println("sum : "+ (a+b));
                                    break;
                            case '-' : 
                                    System.out.println("sub : "+ (a-b));
                                    break;
                            case '*' :
                                    System.out.println("mul : "+ a*b );
                                    break;
                            case '/' :
                                    System.out.println("div : "+ a/b);
                                    break;
                            case '%' :
                                    System.out.println("remainder : "+ a%b);
                                    break;
                            default:
                                    System.out.println("input invalid !!");
                            
                            
                    
                }
        }
}