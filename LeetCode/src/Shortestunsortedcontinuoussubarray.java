public class Shortestunsortedcontinuoussubarray {

    public static void main(String[] args) {

        int[] arr=new int[]{1,2,3,4,5,67,8,9,9,9,9,9,9,9};
        System.out.println(findUnsortedSubarray(arr));

    }

    public static int findUnsortedSubarray(int[] nums) {

        int min=0, max=Integer.MAX_VALUE;
        int i=0;

        for (i = 0; i < nums.length-1; i++) {
            if(nums[i]>nums[i+1]){
                    break;
            }
        }
        if(i+1==nums.length)
            return 0;

        int j=0;
        for (j = nums.length-1; j >i; j--) {
            if(nums[j]<nums[j-1]){
                break;
            }
        }
        System.out.println("I value is "+i+" J value is "+j);
        return (j-i)-1;

    }
}
