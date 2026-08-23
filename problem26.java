/*
A cricket coach records the runs scored by each player in a match. After
reviewing the performance, the coach wants to update the score of one player due
to a scoring correction.
Develop a Java application that stores player scores in a single-dimensional array,
updates the score of a specified player, and displays the revised scoreboard.

Input
Number of Players
Runs Scored by Each Player
Player Number to Update
Revised Score

Sample Input
Enter Number of Players : 5
Runs
45
68
52
39
81
Update Player Number : 4
New Score : 49

Sample Output
==UPDATED SCOREBOARD ==
Player 1 : 45
Player 2 : 68
Player 3 : 52
Player 4 : 49
Player 5 : 81

*/import java.util.*;
class problem26
{
    public static void main(String[] args )
    {
            Scanner sc = new Scanner(System.in);
            int n;
            System.out.println("ENTER THE NUMBER OF PLAYERS :  ");
            n=sc.nextInt();
            int score [] = new int[n];
            int tot=0;
            System.out.println("ENTER SCORE OF EACH PLAYER : " );
            for(int i=0;i<n;i++)
            {
                    score[i]=sc.nextInt();
            }
            System.out.println("ENTER UPDATED PLAYER NUMBER : " );
            int pno=sc.nextInt();
            System.out.println("ENTER REVISED SCORE : " );
            int revised=sc.nextInt();
            score[pno-1]=revised ;
            System.out.println("==UPDATED SCOREBOARD ==");
            System.out.println("REVISED SCORE : " );
            for(int i=0;i<n;i++)
            {
                    System.out.println("player" +(i+1)+" : " +score[i]);
            }
    }
}