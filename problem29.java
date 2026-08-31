/*
A weather research centre records the average monthly temperatures for a region.
The scientists want to compare two datasets collected by different weather
stations.
Develop a Java application that:
Stores temperatures in two arrays.
Displays both arrays.
Uses Arrays.equals() to compare the datasets.
Uses Arrays.fill() to initialize another array with a default value.

Sample Output
== WEATHER DATA ==
Station A
[31, 32, 30, 34, 35]
Station B
[31, 32, 30, 34, 35]
Both datasets are identical.
Default Array
[25, 25, 25, 25, 25] */
import java.util.Arrays;

public class problem29 
{
    public static void main(String[] args) 
    {
            // Create the temperature arrays for Station A and Station B
            int[] stationA = {31, 32, 30, 34, 35};
            int[] stationB = {31, 32, 30, 34, 35};
        
            // Create a third array to hold default values
            int[] defaultArray = new int[5];
        
            // Print the header
            System.out.println("== WEATHER DATA ==");
        
            // Display both station arrays using Arrays.toString()
            System.out.println("Station A " + Arrays.toString(stationA));
            System.out.println("Station B " + Arrays.toString(stationB));
        
            // Compare the two datasets using Arrays.equals()
            if (Arrays.equals(stationA, stationB)) 
            {
                    System.out.println("Both datasets are identical.");
            } else 
            {
                    System.out.println("The datasets are different.");
            }
        
            // Fill the default array with the number 25 using Arrays.fill()
            Arrays.fill(defaultArray, 25);
        
            // Display the filled default array
            System.out.println("Default Array " + Arrays.toString(defaultArray));
    }
}

