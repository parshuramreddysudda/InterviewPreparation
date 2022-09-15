package Medium;

import java.util.*;

public class FindOriginalArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(findOriginalArray(new int[]{4,4,16,20,8,8,2,10})));
    }

    public static int[] findOriginalArray(int[] changed) {

        if(changed.length%2!=0)
            return new int[0];
        Set<Integer> list=new HashSet<>();
        List<Integer> newList=new ArrayList<Integer>();
        for(int num:changed)
            list.add(num);
        Arrays.sort(changed);
        for(int num:changed){
            if(list.contains(num*2)) {
                newList.add(num);
                list.remove(num);
                list.remove(num * 2);
            }
        }
        System.out.println(newList);

        return list.size()==0 ? newList.stream().mapToInt(Integer::intValue).toArray():new int[0];
    }
}
