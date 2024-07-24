package Medium;

public class BestTimeToSell2 {
    public static void main(String[] args) {

        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
//    expected to be 2

    public static int maxProfit(int[] prices) {
        int min=prices[0];
        int max=-1;
        int totalProfit=0;
        for(int i=0;i<prices.length;){

            min=Math.min(prices[i],min);
            while(i<prices.length&&max<prices[i]){
                max=prices[i++];
            }
            totalProfit+=max-min;
            max=-1;
            if(i<prices.length) min=prices[i];
        }
        return totalProfit;
    }
}
