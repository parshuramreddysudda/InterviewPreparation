import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray {
    public static void main(String[] args) {

        int[] arr = new int[]{2,4,3,5,7,10,9,15};
        System.out.println(findUnsortedSubarray(arr));
        ;
    }

    public static int findUnsortedSubarray(int[] nums) {

        int[] arr = new int[nums.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        int i = 0;
        for (i = 0; i < arr.length; i++) {
//            System.out.println(" arr[i] is "+arr[i]+" nums[i] "+nums[i]);
            if (arr[i] != nums[i]) {
                System.out.println("Executed");
                break;
            }
        }
        System.out.println(" I is"+i);
        int j = 0;
        for (j = arr.length-1; j > 0; j--) {
//            System.out.println(" arr[i] is "+arr[j]+" nums[i] "+nums[j]);
            System.out.println("J lenght is " + j + "");
            if (arr[j] != nums[j]) {
                break;
            }
        }
        System.out.println(" J is"+j);

        return (j - i )+ 1;
    }
}
