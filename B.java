class A 
{
    int x;
    char y;
    void getData()
    {
            x=10;
            y='A';           
    }
}
class B extends A
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
                B obj1=new B();
                obj1.getData();
                obj1.showData();
        }
}
