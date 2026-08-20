/*
Develop a Java application that demonstrates the use of instance variables, static
variables, and local variables.

the program should :
store the company name as a static variables.
store employe id and employee name as instance variables.
store the department name as a local variable inside a method.
Display all the details in a formmated report.

Sample Output
==EMPLOYEE DETAILS ==
Company Name : ABC Technologies
Employee ID : E1025
Employee Name: Priya Sharma
Department : Software Development

*/
import java.util.Scanner;
class problem10 
{
    String eid ; // instance variable
    String ename ; // instance variable
    static String cname ; // class variable
    void getDetails() // method (no semicolon)
    {
       String dname ; // local variable

       Scanner sc = new Scanner (System.in);

       System.out.println("Enter eid : ");
       String eid = sc.nextLine();

       System.out.println("Enter ename : ");
       String ename = sc.nextLine();

       System.out.println("Enter Dept :");
       dname = sc.nextLine();

       System.out.println("==EMPLOYEE DETAILS ==");
       System.out.println("company name : " + cname);
       System.out.println("Employee ID :"+ eid);
       System.out.println("Employee Name :"+ ename);
       System.out.println("Department : "+ dname);

    }
    public static void main(String args[])
    {
     cname = "IARE";
     problem10 obj= new problem10 ();
     obj.getDetails();
     
    
    }



}