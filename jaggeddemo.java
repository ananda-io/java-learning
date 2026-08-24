import java.util.Scanner;
public class jaggeddemo 
{
    public static void main(String []args)
    {
            Scanner sc = new Scanner(System.in);
            int items[][] = new int[3][];
         
            items[0]=new int[5];
            items[1]=new int[2];
            items[2]=new int[3];
            System.out.println("ENTER ITEM QUANTITY");
            for(int i=0;i<items.length;i++)
            {
                    for(int j=0;j<items[i].length;j++)
                    {
                            items [i][j]=sc.nextInt();
                    }
            } 
            System.out.println("Qty ");
                for(int i=0 ; i<items.length ; i++)//numbers of rows
                {
                    int tot = 0;
                    for(int j=0;j<items[i].length;j++)//in ith row how many columns are there
                    {
                            System.out.print(items[i][j]+ " ");
                            tot+=items[i][j];
                    }
                    System.out.println(" ");
                    System.out.print("total items : " + tot);
                    
            }      

            
    }
}
