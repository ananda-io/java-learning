//final variable
public class final_variable 
{
    public static void main(String[]args)
    {
            final int[] a={1,2,4};
            a[2]= 99;
            for (int i=0; i<a.length; i++ )
            {
                    System.out.print(a[i]+" ");
            }
            
    }
}
// The above example shows that we can change the values inside the final array but we can not replace the whole array.