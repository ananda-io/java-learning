import java.util.Scanner ;
public class problem6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product Name");
        String name = sc.nextLine();

        System.out.print("Enter Quantity");
        int quantity = sc.nextInt();

        System.out.print("Enter Price per unit");
        double price  = sc.nextDouble();


        System.out.print("***SMART BILL***");
        System.out.println("product name :"+ name);
        System.out.println("Quantity :"+ quantity );
        System.out.println("Unit price : " + price);
        System.out.println("Total Bill Amount :" + (quantity * price));
        sc.close();
    }
    
}
