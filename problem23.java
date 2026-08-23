/*
A treasure hunter explores a series of caves in search of hidden treasure. During
exploration:
Some caves are blocked and should be skipped.
If the treasure is found, the search should stop immediately.
If the explorer decides to abandon the mission, the program should terminate.
Develop a Java application to demonstrate the use of:
continue to skip blocked caves.
break to stop searching when the treasure is found.
return to terminate the program after displaying a completion message.

Sample Output-->
Searching Cave 1...
Searching Cave 2...
Cave 3 Blocked.
Skipping...
Searching Cave 4...
Treasure Found!
Mission Completed. */
import java.util.Scanner;
public class problem23 
{
    public static void main(String[]args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no.of caves : ");
            int n = sc.nextInt();
            sc.nextLine();
            int i= 0;
            boolean status = false;
            do
            {
                    i++;
                    System.out.println("Searching cave : ");
                    System.out.println(i+"cave blocked or not(Y/N) : ");
                    String blocked = sc.nextLine().toLowerCase();
                    if(blocked.charAt(0)=='y')
                    {
                            System.out.println("skipping..");
                            continue;

                    }
                    System.out.println("Treasure found or not(Y/N) : ");
                    String found=sc.nextLine().toUpperCase();
                    if(found.charAt(0)=='Y')
                    {
                            System.out.println("TRESAURE FOUND ! ");
                            System.out.println("MISSION COMPLETED ! ");
                            status=true;
                            break;
                    }
            }while(i<=n);
            if(status==true)
            {
                    return;
            }
            else
            {
                    System.out.println("MISSION NOT COMPLETED...");
            }
    }
}
