abstract class C //ABSTARCT CLASS
{
     int x;
     char y;
     void getData()
     {
            x=10;
            y='A';    
     }
     abstract void showData();//abstract method

} 
class D extends C
{
        float z;
        void getData()
        {
                super.getData();
                z=2.3f;
        }
        void showData()
        {
                System.out.println("x=" + x + " " + "y=" + y +" " + "z=" + z);                
        }
        public static void main(String[]args)
        {
                C obj1=new D();
                obj1.getData();
                obj1.showData();
        }
        
}