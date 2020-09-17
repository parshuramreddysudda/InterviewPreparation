/******************************************************************

An Army Helicopter (100 Marks)
The host government has promised that in addition to the security guards in each match, there will be a platoon of elite commandos that will be deployed for extra protection in each stadium for each match. In order to move quickly between cities and stadiums there will be a dedicated army helicopter on permanent stand by.

The army helicopter has to land in city (rectangular area) which contains several towers (mobile communication towers). For the safe landing of the helicopter, the landing space must not contain any tower in the landing space. A helicopter needs a square shaped landing area which has the side length greater than or equal to the helicopter length. Given a description of the tower positions of the city, you have to find the largest helicopter that can land in the city.



Input Format
The first line of input consists of number of rows (rectangular area or string arrays), N
Next N lines consist of string array. Each string contains symbols (either 'x' or 'o' or '#'). x represents a tower, 'o' represents empty space and '#' is a delimiter between the 'x' and 'o'.



Constraints
1 <= N <= 500

Output Format
Print the length of the largest helicopter that can land in the city else print -1 if input is invalid.



Sample TestCase 1
Input
5
x#o#o#o#x#o
x#o#o#o#x#x
x#o#o#o#x#x
x#o#x#o#o#x
x#o#x#o#o#x
Output
3

******************************************************************************/

/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//  System.out.print("Enter the Matrix : ");
       Scanner sc=new Scanner(System.in);
       int rows=sc.nextInt();

       String str[]=new String[500];
          
            int counter=0;
        for(int i=0; i<=rows;i++)
         {             
                str[i]=sc.nextLine();
              
         }


        for(int i=0; i<=rows;i++)
         {             
                str[i]= str[i].replace("#","");
              
         }

       int start=1,temp=0;
       int ans=0,tempAns=0;

         for(int i=1;i<=rows;i++)
         {

            for(int j=0;j<str[i].length();j++)
            {
                 if(str[i].charAt(j)=='o')
                  {
                   counter++;
                  } 
                else
                 {
                  
                    if(counter>1)
                    {
                     start=j-counter;
                     temp=j-1;
                     // System.out.println("Start is "+start+"  J is "+temp+"  I val"+i);
                     tempAns=calci(start,temp,i,str);
                     // System.out.println(tempAns);
                     if(ans<tempAns)
                     {
                        ans=tempAns;
                     }
                    }
                    counter=0;
                  }

            }

         }


 

       if(ans>1)
       {
          System.out.print(ans);
       }     
       else{
         System.out.print("-1");
       }   
      
         
        

   }

   public static int calci(int start,int rep,int row,String[] str)
   {
      int ans=0,val=0;
      int jVal=rep-start+1;
          for(int i=row;i<=jVal;i++)
          {
             for(int j=start;j<=rep;j++)
             {
               
                 if(str[i].charAt(j)=='o')
                 {
                     ans=1;
                     // System.out.println(str[i].charAt(j)+" I is  "+i+" J is "+j);
                 }
                 else
                 {
                  //   System.out.println(str[i].charAt(j)+" I is  "+i+" J is "+j);
                    ans=0;
                    break;
                 }
                

             }
             if(ans==1)
             {
                val++;
             }
          }
         
          
          
          return val;
   }

}
