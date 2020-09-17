/**********************************************************************************


//Given two strings S1 and S2 consisting of only lowercase characters whose anagrams are almost equal. The task is to count the number of characters which needs to be edited(delete) to make S1 equal to S2.

Input:
For each testcase, first line of input contains number of testcase T. For each testcase, there will be two lines containing string S1 and S2.

Output:
For each testcase, print the count of characters needed to delete to make S1 and S2 equal.

Constraints:
1 <= T <= 100
1 <= S1, S2 <= 104

Example:
Input:
1
madame
madam

Output:
1

Explanation:
Testcase 1: String S1 = madame, string S2 = madam. character 'e' in first string is need to be deleted to make S1 equal to S2.

**************************************************************************************/



//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    
	public static void main (String[] args)
	{
    	 Scanner sc = new Scanner(System.in);
    	 int t = sc.nextInt();
    	 
    	 boolean flag = false;
    	 while(t-- > 0){
    	   String s1=sc.next();
    	   String s2=sc.next();
    	   Geeks obj=new Geeks();
    	   System.out.println(obj.coutChars(s1,s2));
    	   
    	 }
    }
}
//Position this line where user code will be pasted.
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/*Function to count number of characters 
* to make s1 and s2 equal
* s1 : first string
* s2 : second string
*/
class Geeks{
    

    static int coutChars(String s1, String s2)
    {
     
        // System.out.println(s1.charAt(1));
        
        int j=0,count=0; 
        
        if(s1.length()>s2.length())
        {
            String temp=s2;
            s2=s1;
            s1=temp;
        }
        
 for(int i=0;i<1;i++)
      {
          for(j=i;j<s2.length();j++)
          {
              if(s1.charAt(i)==s2.charAt(j))
              {
                //   System.out.println("If loop"+s2.charAt(j));
                   i++;
                   if(i==s1.length())
                   {
                       break;
                   }
              }
              else
              {
                //   s2=s2.deleteCharAt(j);
                  count++;
                //   System.out.println(s2.charAt(j));
              }
          }
      }
      
      if(s2.length()!=j)
      {
         int temp=s2.length()-j-1;
         count=count + temp;
        //   System.out.println(temp);
      }
    
   return count;
    }
    

       
        // while(true)
        // { 
        //     if(s1.charAt(i)==s2.charAt(j))
        //     {
        //       System.out.println("If loop"+s2.charAt(j)); 
        //       i++;
        //       j++; 
        //     }
        //     else
        //     {
        //         System.out.println("If loop"+s2.charAt(j)); 
        //         j++;
        //         count++;  
        //     } 
            
        //     if(i==s1.length())
        //     {
        //         break;
        //     }
        // } 
        // while(j==s2.length())
        // {
        //     count++;
        // }
      
      
//Geeks for Geeks URL https://ide.geeksforgeeks.org/KtMBlA0vp8
}