package Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddArrayForm {



    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,0};
        int k = 9999;

        List<Integer> result = addToArrayForm(num, k);
        System.out.println(result);
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {

        int car=0;
        List<Integer> list= new ArrayList<Integer>();
        for(int i=num.length-1;i>=0;i--){
            if(k>0){
                num[i]+=k%10 + car;
                k= k/10;
            }else{
                num[i]+=car;
                car = num[i]/10;

            }
            list.add(num[i]%10);
            car = num[i]/10;
            System.out.println(" List is "+list);
        }

        if(car>0)
            list.add(car);
        else if(k>0)
            list.add(k);
        Collections.reverse(list);
        return list;
    }
}


