/*
A university is developing an admission portal. The university name remains the
same for all students, while each student has unique information. During
admission, the selected department is entered temporarily.

Develop a Java application to demonstrate variable scopes by storing:
University Name (Static Variable)
Student Roll Number (Instance Variable)
Student Name (Instance Variable)
Department (Local Variable)
Display the complete admission record.


Sample Output
==STUDENT PROFILE ==
University : ABC Engineering University
Roll Number: 23ECE101
Student Name: Anjali
department : CSE
*/
import java.util.Scanner;
public class problem11
{
    String roll ;// instance variable
    String name ; // instance variable
    static String uname ; //static variable
    void getDetails()
    {
     String dname ; //local variable

     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Roll no : ");
     roll=sc.nextLine();

     System.out.println("Enter student name : ");
     name=sc.nextLine();

     System.out.println("Enter department Name : ");
     dname = sc.nextLine();

     System.out.println("==STUDENT PROFILE ==");
     System.out.println("University : " + uname);
     System.out.println("Roll Number : " + roll);
     System.out.println("Student Name: " + name );
     System.out.println("department : " + dname);

    }
    public static void main(String args[])
    {
        uname = "ABC";
        problem11 obj = new problem11();
        obj.getDetails();
    }
    
}
