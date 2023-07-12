package Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TotalFruits {
    public static void main(String[] args) {

        System.out.println(totalFruits(new int[]{1,2,3,4,3,4,3,2,2,3,3,3,4}));
//        System.out.println(totalFruits(new int[]{2,1,2,3,3,3,2,2,3,3,3,3,2,4,4,4,4,4,5,6,8,6,7,7,8,9,9}));
    }

    private static int totalFruits(int[] fruits) {
        int current=0;
        int start=0;int end=0;
        int max=0;
        Map<Integer,Integer> map=new HashMap<>();
        while(current<fruits.length){
            while(current<fruits.length){
                map.put(fruits[current],map.getOrDefault(fruits[current],0)+1);
                if(map.size()>=3)
                    break;
                current++;
            }
            max=Math.max(max,current-start);
            while(start<fruits.length&&map.size()>=3){
                map.put(fruits[start],map.get(fruits[start])-1);
                if(map.get(fruits[start])==0) {
                    map.remove(fruits[start]);
                }
                start++;
            }
            current++;

        }
        return max;
    }
}
