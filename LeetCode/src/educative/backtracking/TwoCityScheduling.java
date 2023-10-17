package educative.backtracking;

import java.util.Arrays;
import java.util.PriorityQueue;

class TwoCityScheduling {
    public static void main(String[] args){
        int[][][] inputCosts = {{{10, 20}, {30, 200}, {400, 50}, {30,20}},
                {{259,770}, {448,54}, {926,667}, {184,139}, {840,118}, {577,469}},
                {{515, 563}, {451, 713}, {537, 709}, {343, 819}, {855, 779},{457, 60}, {650, 359}, {631, 42}},
                {{1, 2}, {3, 4}, {5, 6}, {7,8}},
                {{1, 2}, {1, 2}, {1, 2}, {1, 2}},
                {{10, 100}, {10, 1000}, {50, 500}, {1,100}}};

        for(int i=0;i < inputCosts.length;i++){
            System.out.println((i + 1)+ "\tcosts"+ Arrays.deepToString(inputCosts[i]));
            System.out.println("\n\tThe minimum cost to send people equally into city A and B is: "+ twoCityScheduling(inputCosts[i]));
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }
    public static int twoCityScheduling(int[][] costs) {

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);

        System.out.println(Arrays.deepToString(costs));

        for (int i = 0; i < costs.length; i++) {
            pq.add(new int[]{i,costs[i][0] - costs[i][1]});
        }
        int total=0;
        int index=0;
        int size=pq.size();
        for(int i=0;i<size/2;i++){
            index=pq.peek()[0];
            total+=costs[index][0];
            pq.poll();
        }
       while(!pq.isEmpty()){
           index=pq.peek()[0];
           total+=costs[index][1];
           pq.poll();
       }
//        System.out.println(pq);
        return total;
    }

}