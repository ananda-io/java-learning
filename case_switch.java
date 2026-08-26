import java.util.Scanner;
public class case_switch
{
        public static void main(String[]args)
        {
                    
                    Scanner sc= new Scanner(System.in);

                    System.out.println("ENTER BUTTON NUMBER : ");
                    int button = sc.nextInt();

                    switch(button)
                    {
                            case 1 :
                                        System.out.println("NAMASKARAM");
                                        break;
                            case 2 :
                                        System.out.println("VANAKAM");
                                        break;
                            case 3 :
                                        System.out.println("HELLO ...");
                                        break;
                            case 4 :
                                        System.out.println("invalid button");
                    }

        }
}