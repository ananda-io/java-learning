/*
A city transport department operates several bus routes. Since each route has a
different number of bus stops, the transport department wants to store the stop
numbers efficiently.

Develop a Java application using a jagged array, where each row represents a bus
route and each row contains a different number of bus stops.

The program should:
Read the number of routes.
Read the number of stops in each route.
Store the stop numbers.
Display the complete route information.

Sample Input-->
Enter Number of Routes : 3
Route 1 Stops : 4
101 102 103 104
Route 2 Stops : 3
201 202 203
Route 3 Stops : 5
301 302 303 304 305

Sample Output-->
==BUS ROUTES ==
Route 1 : 101 102 103 104
Route 2 : 201 202 203
Route 3 : 301 302 303 304 305 */
import java.util.Scanner;

public class problem28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read the number of routes
        System.out.print("Enter Number of Routes : ");
        int totalRoutes = scanner.nextInt();

        // 2. Initialize the jagged array
        int[][] busRoutes = new int[totalRoutes][];

        // 3. Read the number of stops and stop numbers for each route
        for (int i = 0; i < totalRoutes; i++) 
        {
            System.out.print("Route " + (i + 1) + " Stops : ");
            int totalStops = scanner.nextInt();
            
            // Allocate memory for the specific row
            busRoutes[i] = new int[totalStops];

            // Store the stop numbers
            for (int j = 0; j < totalStops; j++) 
            {
                busRoutes[i][j] = scanner.nextInt();
            }
        }

        // 4. Display the complete route information
        System.out.println("\n==BUS ROUTES ==");
        for (int i = 0; i < busRoutes.length; i++) 
        {
            System.out.print("Route " + (i + 1) + " : ");
            for (int j = 0; j < busRoutes[i].length; j++) 
            {
                System.out.print(busRoutes[i][j] + " ");
            }
            System.out.println(); // Newline after each route
        }

        scanner.close();
    }
}

