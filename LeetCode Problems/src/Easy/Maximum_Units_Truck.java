package Easy;

import java.util.Arrays;

public class Maximum_Units_Truck {
    public static void main(String[] args) {

        System.out.println(maximumUnits(new int[][]{{1, 3}, {2, 2}, {3, 1}}, 10));
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes,(a, b)-> b[1]-a[1]);

        int maxUnitOfboxes=0;
        for(int[] box: boxTypes){
            int noOfBoxes= box[0];
            int noOfUnits=box[1];

            if(truckSize>=noOfBoxes){
                maxUnitOfboxes+= noOfBoxes * noOfUnits;
                truckSize-= noOfBoxes;
            }
            else{
                maxUnitOfboxes+= truckSize * noOfUnits;
                return maxUnitOfboxes;
            }
        }
        return maxUnitOfboxes;
    }
}
