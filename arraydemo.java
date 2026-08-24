public class arraydemo 
{
    public static void main (String[]args)
    {
            int []marks; //array declaration
            marks=new int[5];//dynamic array initiallization
            marks[0]=25;
            marks[1]=50;
            marks[2]=100;
            marks[3]=66;
            marks[4]=77;
            //traversing array
            for (int i=0;i<marks.length;i++)
            {
                    System.out.println(marks[i]);
            }


    }
}
