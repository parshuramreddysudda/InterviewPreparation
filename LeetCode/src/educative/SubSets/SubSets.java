package educative.SubSets;

import java.util.*;

public class SubSets {
    public static void main(String[] args) {
        int[][] inputSets = {
//                {},
                {2, 5, 7},
                {1, 2},
                {1, 2, 3, 4},
                {7, 3, 1, 5}
        };

        for (int i = 0; i < inputSets.length; i++) {
            int[] set = inputSets[i];
            System.out.println((i + 1) + ". Set: " + Arrays.toString(set));
            List<List<Integer>> subsets = findAllSubsets(set);
            System.out.println("   Subsets: " + subsets);
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }
    public static List<List<Integer>> findAllSubsets(int[] nums) {
        // Replace this placeholder return statement with your code

        List<List<Integer>> listList = new ArrayList<>();
        Set<List<Integer>> setList=new HashSet<>();

        setList.add(new ArrayList<>());
        for (int num:nums) {

            List<List<Integer>> tempList=new ArrayList<>();
            for (List<Integer> inNum:setList) {

                List<Integer> newList=new ArrayList<>(inNum);
                newList.add(num);
                tempList.add(newList);
            }
            setList.addAll(tempList);
        }
        listList.addAll(setList);

        return listList;
    }
}
