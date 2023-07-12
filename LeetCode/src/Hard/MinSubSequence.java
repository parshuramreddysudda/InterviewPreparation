package Hard;

import leetcode.ArraysStrings.TwoSum;

import java.util.*;

public class MinSubSequence {
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("aaaaabbbababababababvaavfa"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int[] arr=new int[200];
        Arrays.fill(arr,-1);
        int max=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i);
            if(arr[index]>-1){
                max=Math.max(max,i-start);
                if(start<=arr[index])
                    start=arr[index]+1;
                arr[index]=i;
            }else{
                arr[index]=i;
            }
        }
        if(start==0)
            return s.length();

        max=Math.max(max,s.length()-start);
        return max;
    }

    public static int countGoodSubstrings(String s) {

        if(s.length()<=2)
            return 0;
        StringBuilder str=new StringBuilder(s.charAt(0));
        Set<String> set=new HashSet<>();
        int count=0;
        for (int i = 0; i < s.length();) {
            while(str.length()!=3 && i<s.length()){
                String ch=String.valueOf(s.charAt(i++));
                if(str.indexOf(ch)==-1)
                    str.append(ch);
                else{
                    str.replace(0,str.lastIndexOf(ch)+1,"");
                    str.append(ch);
                }
            }
            if(str.length()==3)
                count++;
            str.replace(0,1,"");

        }


        return count;
    }

    public static List<List<Integer>> findPrimePairs(int n) {

        int rem=0;
        List<List<Integer>> mainList=new ArrayList<>();
        for (int i = n-1; i >=n/2; i--) {
            rem=n-i;

            if(isPrime(rem)&&isPrime(i) && rem <i) 
                mainList.add(new ArrayList<>(Arrays.asList(rem,i)));
        }

        return mainList;
    }

    public static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        if (n == 2 || n == 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

    public static int[] twoSum(int[] numbers, int target) {

        int low=0,high=numbers.length-1;
        int mid=0;

        while(low<high){
            mid=low + ((high - low) / 2);
            if(low==mid || mid ==high)
                break;
            if(numbers[mid]<=target)
                low=mid+1;
            else
                high=mid-1;
        }

        low=0;
        int sum=0;
        while(low<=high){
            sum = numbers[low]+numbers[high];
            if(sum==target)
                return new int[]{low+1,high+1};
            else if(sum<target)
                low++;
            else
                high--;
        }

        return numbers;
    }



}
