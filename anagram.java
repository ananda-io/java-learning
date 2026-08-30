import java.util.Arrays;
import java.util.Scanner;

public class anagram 
{
    public static void main(String[] args) 
    {
                // Create a Scanner object to read user input
                Scanner sc = new Scanner(System.in);
                
                System.out.println("ENTER FIRST STRING : ");
                String s1 = sc.nextLine();
                
                System.out.println("ENTER SECOND STRING : ");
                String s2 = sc.nextLine();
                
                // Remove spaces and convert to lowercase for fair comparison
                s1 = s1.replaceAll("\\s", "").toLowerCase();
                s2 = s2.replaceAll("\\s", "").toLowerCase();
                
                // Check if they are anagrams
                if (checkAnagram(s1, s2)) 
                {
                        System.out.println("The strings are anagrams.");
                } else 
                {
                        System.out.println("The strings are NOT anagrams.");
                }
                sc.close();
    }
    
        // Function to check if two strings are anagrams
        public static boolean checkAnagram(String str1, String str2) 
        {
                // If lengths are different, they cannot be anagrams
                if (str1.length() != str2.length()) 
        {
                return false;
        }
        
        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        // Sort both character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
