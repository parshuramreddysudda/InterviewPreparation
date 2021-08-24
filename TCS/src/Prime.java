import java.io.*;
import java.lang.Math;
class Prime
{
    // Function to find the maximum length of a substring with an equal sum
    // of left and right half
    public static int longestPalindrome(String str)
    {
        int[] sum = new int[str.length() + 1];
 
        for (int i = 1; i <= str.length(); i++)
        {
            sum[i] = sum[i - 1] + (str.charAt(i - 1) - '0');
        }
 
        int max = 0;

        for (int i = 0; i < str.length() - 1; i++)
        {
            for (int j = i+1; j < str.length(); j += 2)
            {
                int range = j - i + 1;

                int mid = i + range / 2;

                if ((sum[mid] - sum[i] == sum[j+1] - sum[mid])
                        && max < range) {
                    max = range;
                }
            }
        }
 
        return max;
    }
 
    public static void main(String[] args)
    {
        String str = "12414224";
 
        System.out.print("The length of the longest palindromic sum substring is "
                + longestPalindrome(str));
    }
}