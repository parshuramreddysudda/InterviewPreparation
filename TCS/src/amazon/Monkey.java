package amazon;

import java.util.HashMap;
import java.util.HashSet;

public class Monkey {

	public static void main(String[] args) throws Exception {

		int[] arr = new int[] { 0, 1, 3, 5, 6, 8, 12, 17 };
		System.out.println(solve(arr));
	}

	public static boolean solve(int[] trees) {
		HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for(int num: stones) map.put(num, new HashSet<>());
        map.put(0, new HashSet<>(){{add(0);}});
        for(int stone: stones){
            HashSet<Integer> tmp = map.get(stone);
            for(int item: tmp){
                for(int k = -1; k <= 1; k++){
                    if(item + k > 0 &&map.containsKey(stone + item + k)){
                        map.get(stone + item + k).add(item + k);
                    }
                }
            }
        }
        return map.get(stones[stones.length - 1]).size() > 0;
    }
	}


}
