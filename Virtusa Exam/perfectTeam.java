/***************************************************************************


You will be given a pattern of pcmbz for which P, C, M, B, Z represent different category respectively.
The task is to create a team list 
Unique team members
each Team should have at least one team member
No repetition
Return the maximum team members can be formed from the given pattern.
Test case  1 
            Input: pcmbz
            Output: 1
            
            
            
******************************************************************************/




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the function below.
     */
    static int differentTeams(String skills) {

               int n=skills.length();
               int p=0,c=0,m=0,b=0,z=0;

               for(int i=0;i<n;i++)
               {
                   if(skills.charAt(i)=='p')
                   {
                       p++;
                   }
                   else if(skills.charAt(i)=='c')
                   {
                       c++;
                   } 
                    else if(skills.charAt(i)=='m')
                   {
                       m++;
                   } 
                    else if(skills.charAt(i)=='b')
                   {
                       b++;
                   } 
                    else if(skills.charAt(i)=='z')
                   {
                       z++;
                   } 
                  
               }

               int sum=p+c+m+b+z;
               int[] nums={p,c,m,b,z};
              Arrays.sort(nums);
              

// 
            //    int div=sum/5;
            //     System.out.println(div);
            //    System.out.println(nums[0]);
            //    system sum/5;
            return nums[0];

    }
    public static void main(String[] args) throws IOException {
