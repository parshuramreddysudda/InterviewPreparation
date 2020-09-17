/************************************************************************************

You are given a string s of x and y. You need to verify whether the string follows the pattern xnyn. That is the string is valid only if equal number of ys follow equal number of xs.
As an example: xxyyxxyy is valid. xy is valid. xxyyx is invalid. xxxyyyxxyyxy is valid.

Input Format:
The first line of input contains T, the number of testcase. T testcases follow. Each testcase contains single line of input denoting the string s.

Output Format:
For each testcase, in a new line, print 1 if the string is valid else print 0.

Your Task:
Since this is a function problem, you don't need to take any input. Just complete the function follPatt(string s) that outputs 1 if string is valid, else it outputs 0.

Constraints:
1 <= T <= 100
1 <= |s| <=100

Examples:
Input:
2
xxyy
xyx
Output:
1
0
*************************************************************************************/


{
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
    	   String s=sc.next();
    	   Geeks obj=new Geeks();
    	   obj.follPatt(s);
    	   
    	 }
    }
}
//Position this line where user code will be pasted.

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Geeks{
    
    static void follPatt(String s)
    {
       
      System.out.println(iterative(0,s));
    }
    
    static int iterative(int i,String s)
    {
        
        int temp,j,counter=0,jCounter=0,iCounter=0,res=0;
         int n=s.length();
        temp=i;
        for(i=temp;i<s.length();i++)
        {
            if(s.charAt(i)=='y')
            {
                break;
            }
            else
            {
               
                counter++;

            }
        }
        iCounter=counter;
         counter=counter+i;
        //  System.out.println("I values after 1 loop "+i +" Coum value"+counter);
         
          
        for(j=i;j<counter;j++)
        {
            if(s.charAt(j)=='x')
            {
                // System.out.println("wrong");
                break;
            }
            else
            {
                //  System.out.println("Matched " + j);
                 jCounter++;
             
            }
        }
        if(iCounter==jCounter)
        {
            //  System.out.println("Both equal" + iCounter);
             
            n=n-j;
             
             if(j==s.length())
             {
                    // System.out.println("Completed Exe" + iCounter);
                    res=1;
                    return res;
             }
             else if(n==1)
             {
                // System.out.println("outof" + j);
                res=0;
             }
             else 
             {
                    // System.out.println("No done" + j);
                    res=iterative(j,s);
             }
             
        }
        else
        {
            res=0;
        }
        // System.out.println("Comple" + res);
          return res;
    }
}
