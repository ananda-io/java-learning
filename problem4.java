import java.util.Scanner ;
public class problem4{
    public static void main(String[]args)
    { Scanner sc = new Scanner(System.in);
      System.out.print("Enter student name : ");
      String name = sc. nextLine();

      System.out.print("Enter Roll Number : ");
      String Roll = sc.nextLine();

      System.out.print("Enter department : ");
      String department = sc.nextLine();

      System.out.print("Enter semester : ");
      int semester = sc.nextInt();
      sc.nextLine();
      System.out.print("Enter CGPA : ");
      double CGPA = sc.nextDouble();

      sc.nextLine();
      System.out.println("Student Deatails : ");
      System.out.println("Name : " + name);
      System.out.println("Roll no : " + Roll);
      System.out.println("Department : " + department);
      System.out.println("Semester : " + semester);
      System.out.println("CGPA : " + CGPA);
      sc.close();
    }
}