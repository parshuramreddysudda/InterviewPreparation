package Hard;

import leetcode.ArraysStrings.TwoSum;

import java.util.*;

public class MinSubSequence {
    public static void main(String[] args) {

        System.out.println(minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
    }

    public static int minSubArrayLen(int target, int[] nums) {

        int size=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        int index=0;
        int sum=0;
        int start=0;
        while(index<nums.length){
            sum+=nums[index];
            if(sum>=target){
                min=Math.min(min,(index-start)+1);
                while(sum>=target){
                    min=Math.min(min,index-start);
                    sum-=nums[start++];
                }

            }
            index++;
        }

        return min;
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
