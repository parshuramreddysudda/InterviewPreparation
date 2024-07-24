package Medium;

public class MinimumSubAarryLength {
    public static void main(String[] args) {

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
}
