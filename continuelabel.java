public class continuelabel 
{
        public static void main (String[]args)
        {
                outer :
                for(int i=1 ; i<=5 ; i++)
                {
                        inner:
                        for(int j=1 ; j<=5 ; j++)
                        {
                                if(i==j)
                                        continue outer ;
                                System.out.println("hello XYZ");
                        }
                        System.out.println("hello ABC");
                }        
                System.out.println("hello MAIN");
        }        
}
