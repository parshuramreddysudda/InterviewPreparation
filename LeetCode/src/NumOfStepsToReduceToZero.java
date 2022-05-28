public class NumOfStepsToReduceToZero {
    public static void main(String[] args) {

        System.out.println(numberOfSteps(123));
    }

    public static int numberOfSteps(int num) {

        int count = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -=1;
            }
            count++;
            System.out.println("num is "+num);
        }

        return count;
    }
}
