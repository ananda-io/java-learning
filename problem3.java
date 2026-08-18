import java.util.Scanner ;
public class problem3{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  austronaut name : ");
        String name = sc.nextLine();

        System.out.print("Enter age : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter country name : ");
        String country = sc.nextLine();

        System.out.print("enter mission number : ");
        int mission = sc.nextInt();

        System.out.println("\n Astronaut Deatails : ");
        System.out.println("Name : " + name );
        System.out.println("Age: " + age);
        System.out.println("country : " + country);
        System.out.println("Mission number :" + mission);
        sc.close();
        

    }    
}