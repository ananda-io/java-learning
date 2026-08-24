import java.util.Arrays;
public class Array_class
{
    public static void main(String[]args)
    {
            int[]arr={50,20,40,10,30};
            //sort. the array
            Arrays.sort(arr);
            System.out.println("Sorted array : " + Arrays.toString(arr));

            //2.Search using the binary search()
            int index =Arrays.binarySearch(arr,30);
            System.out.println("index of 30 "+ index);

            //3.Copy the Array
            int[]copy=Arrays.copyOf(arr,arr.length);
            System.out.println("Cppied array : "+Arrays.toString(copy));

            //4.compare two Arrays
            System.out.println("Arrays equal: "+ Arrays.equals(arr,copy));

            //5.Fill an array
            int[]numbers=new int[5];
            Arrays.fill(numbers,100);
            System.out.println("filled array : " + Arrays.toString(numbers));
    }
}
