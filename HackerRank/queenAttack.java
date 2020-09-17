/******************************************************************************************************* 



-------------------13 Test Cases Passed Solution---------------



You will be given a square chess board with one queen and a number of obstacles placed on it. Determine how many squares the queen can attack.

A queen is standing on an  chessboard. The chess board's rows are numbered from  to , going from bottom to top. Its columns are numbered from  to , going from left to right. Each square is referenced by a tuple, , describing the row, , and column, , where the square is located.

The queen is standing at position . In a single move, she can attack any square in any of the eight directions (left, right, up, down, and the four diagonals). In the diagram below, the green circles denote all the cells the queen can attack from :

image

There are obstacles on the chessboard, each preventing the queen from attacking any square beyond it on that path. For example, an obstacle at location  in the diagram above prevents the queen from attacking cells , , and :

image

Given the queen's position and the locations of all the obstacles, find and print the number of squares the queen can attack from her position at . In the board above, there are  such squares.

Function Description

Complete the queensAttack function in the editor below. It should return an integer that describes the number of squares the queen can attack.

queensAttack has the following parameters:
- n: an integer, the number of rows and columns in the board
- k: an integer, the number of obstacles on the board
- r_q: integer, the row number of the queen's position
- c_q: integer, the column number of the queen's position
- obstacles: a two dimensional array of integers where each element is an array of  integers, the row and column of an obstacle

Input Format

The first line contains two space-separated integers  and , the length of the board's sides and the number of obstacles.
The next line contains two space-separated integers  and , the queen's row and column position.
Each of the next  lines contains two space-separated integers  and , the row and column position of .

Constraints

A single cell may contain more than one obstacle.
There will never be an obstacle at the position where the queen is located.
Subtasks

For  of the maximum score:

For  of the maximum score:

Output Format

Print the number of squares that the queen can attack from position .

Sample Input 0

4 0
4 4
Sample Output 0

9
Explanation 0

The queen is standing at position  on a  chessboard with no obstacles:

image

Sample Input 1

5 3
4 3
5 5
4 2
2 3
Sample Output 1

10
    ********************************************************************************************************/ 
 import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {

       int[][] game=new int[n+1][n+1];
      for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++)
    {
        game[i][j]=1;
    }
}
 game[r_q][c_q]=2;
    // System.out.println(obstacles[1][1]);
    int temx=0,temy=0;
       for(int i=0;i<obstacles.length;i++)
       {
           temx=0;temy=0;
           for(int j=0;j<obstacles.length-1;j++)
           {
            //    System.out.println(obstacles[i][j]+" Value is"+i+" "+j);
                 temx=obstacles[i][j];
                 temy=obstacles[i][j+1];
                 break;
           }
           if(temx>0)
           {
              game[temx][temy]=0;//Attaching obstacles as 0
           }
         
       }
       
    //    for(int i=1;i<=n;i++)
    //    {
    //           for(int j=1;j<=n;j++){
    //               System.out.println(game[i][j]+" "+i+" "+j);
    //           }
    //    }
         
 int result=0;
     result= calcHori(game,r_q,c_q,n);
     result += calcStrai(game,r_q,c_q,n);
      result += diagoLeft(game,r_q,c_q,n);//    Digo is "  / "   
      result += diagoRight(game,r_q,c_q,n);
 
 
       return result;
    }
    public static int diagoRight(int game[][],int x,int y,int n){

         int i=x;
         int result=0;
         for(int j=y;j<=n;j--)
             {
                //  System.out.println(" Right I is "+i+" J is "+j);
                 
                 if(game[i][j]==0)
                 {
                   break;
                 }
                 else if(game[i][j]==2){
                     i--;
                   continue;
                 }
                 else if (game[i][j]==1)
                 {
                   result++;  
                 }
                 if(i==1||j==1)
                 {
                     break;
                 }
                 i--;
             }
             int j=y;
             for(i=x;i<=n;i++)
             {
                //  System.out.println(" Right I is "+i+"J is "+j);
                
                 if(game[i][j]==0)
                 {
                  break;
                 }
                 else if(game[i][j]==2){
                      j++;
                     continue;
                 }
                 else if(game[i][j]==1)
                  {
                     result++;
                 }
                 if(i==n||j==n)
                 {
                     break;
                 }
                  j++;
             }
        //  System.out.println("Right Result "+result);
         return result;


    }
     public static int diagoLeft(int game[][],int x,int y,int n){
 
          int i=x;
         int result=0;
             for(int j=y;j<=n;j++)
             {
                //  System.out.println("Left I is "+i+"J is "+j);
                 
                 if(game[i][j]==0)
                 {
                   break;
                 }
                 else if(game[i][j]==2)
                 {
                   i--;
                   continue;
                 }
                 else if (game[i][j]==1)
                 {
                   result++;  
                 }
                 if(i==n||j==n)
                 {
                     break;
                 }
                 i--;
                
             }
             int j=y;
             for(i=x;i<=n;i++)
             {
    // System.out.println("I is "+i+" J is "+j+" Game is "+game[i][j]);
                
                 if(game[i][j]==0)
                 {
                  break;
                 }
                 else if(game[i][j]==2){
                     j--;
                     continue;
                 }
                 else if (game[i][j]==1)
                 {
                     result++;
                 }
                 if(i==1||j==1)
                 {
                     break;
                 }
                  j--;
             }
        //  System.out.println("Left Result "+result);
         return result;
 
     }
 
 public static int calcStrai(int game[][],int x,int y,int n){
 
         int xMin=0,close=0,result=0;
             
              for(int j=1;j<=n;j++)
              {
                  if(game[j][y]==2)
                  {
                      xMin=j;
                      close=1;
                  break;
                  }
              }
 
            int templ=0;
            // System.out.println("Temp Hori"+xMin);
          int i=y;
              for(int j=xMin;j<=n;j++){
                  if(game[j][y]==0)
                  {
                      templ=1;
                      break;
                  }
                  else if (game[j][y]==2){
 
                  }
                  else
                  {
                    //   System.out.println("I Up value is "+j+"J value"+y);
                      result++;
                  }
              }
             
         
           
          i=y;
              for(int j=xMin;j>=1;j--){
                  if(game[j][y]==0)
                  {
                      templ=1;
                      break;
                  }
                  else if (game[j][y]==2){
                     
                  }
                  else
                  {  
                    //   System.out.println("I Low value is "+j+"J value"+y);
                      result++;
                  }
              }
         
        //   System.out.println(" Verti Result "+result);
          return result;
    }
 
 
    public static int calcHori(int game[][],int x,int y,int n){
 
         int xMin=0,close=0,result=0;
          for(int i=x;i<=n;i++){
              for(int j=1;j<=n;j++)
              {
                  if(game[i][j]==2)
                  {
                      xMin=j;
                      close=1;
                  break;
                  }
              }
              if(close==1)
              {
                  break;
              }
          }
            int templ=0;
            // System.out.println("Temp "+xMin);
          int i=x;
              for(int j=xMin;j<=n;j++){
                  if(game[i][j]==0)
                  {
                      templ=1;
                      break;
                  }
                  else if (game[i][j]==2){
 
                  }
                  else
                  {
                    //   System.out.println("I value is "+i+"J value"+j);
                      result++;
                  }
              }
             
         
           
          i=x;
              for(int j=xMin;j>=1;j--)
              {
                //   System.out.println("I value is "+i+"J value"+j);
                  if(game[i][j]==0)
                  {
                      templ=1;
                      break;
                  }
                  else if (game[i][j]==2){
                     
                  }
                  else
                  {  
                    //   System.out.println("I value is "+i+"J value"+j);
                      result++;
                  }
              }
         
        //   System.out.println("Rigthsd Result "+result);
          return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] r_qC_q = scanner.nextLine().split(" ");

        int r_q = Integer.parseInt(r_qC_q[0]);

        int c_q = Integer.parseInt(r_qC_q[1]);

        int[][] obstacles = new int[k][2];

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
                obstacles[i][j] = obstaclesItem;
            }
        }

        int result = queensAttack(n, k, r_q, c_q, obstacles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}    