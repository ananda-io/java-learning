import java.util.Scanner;
public class problem5 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name : ");
        String name = sc.nextLine();

        System.out.println("Enter quantity : ");
        int quantity = sc.nextInt();

        System.out.println("Enter price per item : ");
        double price = sc.nextDouble();

        System.out.println("*** BILLING *** ");
        System.out.println("Product Name: " + name);
        System.out.println("Quantity : " + quantity);
        System.out.println("price : " + price);
        System.out.println(" Total Amount : " + (quantity * price)  );
        sc.close();
    }
}
