 
/******************************************************************************


Given length L and breadth B of N rectangles. The task is to return maximum area of the rectangle.

Input:
First line of input contains number of testcases T. For each testcase, there will be two lines, first of which contains N, number of rectangle, next line contains length and breadth of N rectangles.

Output:
For each testcase, output maximum area of rectangle.

User Task: Your task is to complete the function calculate_Area() which returns maximum area. Use area() function in Rectangle class.

Constraints:
1 <= T <= 10
1 <= N <= 103
1 <= L, B <= 104
1 <= Area <= 108

Example :
Input:
1
3
1 2 3 4 5 6

Output:
30

Explanation:
Testcase 1: Area of rectangle with length 5 and breadth 6 is maximum, and is equal to 30.



******************************************************************************/
{
//Initial Template for Java
import java.io.*;
import java.util.*;
// Pair class
class Rectangle{
    int length;
    int breadth;
    
    // Constructor
    public Rectangle(int x, int y){
        this.length = x;
        this.breadth = y;
    }
    
    // Funtion to find area
    public int area(){
        return (this.length*this.breadth);
    }
}
//Position this line where user code will be pasted.
// Driver class with main function
class GFG {
    
    // Driver code
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    int N = sc.nextInt();
		    
		    // Creating an array of Pair
		    Rectangle arr[] = new Rectangle[N];
		    
		    // Taking input length and breadth
		    for(int i = 0;i<N;i++){
		        int length = sc.nextInt();
		        int breadth = sc.nextInt();
		        arr[i] = new Rectangle(length, breadth);
		    }
		    
		    maxArea obj = new maxArea();
		    System.out.println(obj.calculate_Area(arr));
		    
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/*Class maxArea to calculate Area of rectangles
* arr : array containing rectangles
* calculate_Area : function to calculate area
* and return the maximum area
*/
class maxArea{
    
    static int calculate_Area(Rectangle arr[]){
        
      int max=0,temp=0;
          
            for(int i=0;i<arr.length;i++)
            {
                
                temp=(arr[i].length*arr[i].breadth);
                if(temp>max)
                {
                    max=temp;
                }
               
                  
            }
            
    
        return max;
    }
    
    
}