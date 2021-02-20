import java.util.*;
class Main{

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int[][] matrix = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = s.nextInt();
            }
        }
        int q = s.nextInt();
        int ql = s.nextInt();
        while(q>0){
            int a = s.nextInt();
            int b = s.nextInt();
            int count = 0;
            int rsum = 0;
            int csum = 0;
            for(int i = 0;i < r; i++){
                rsum = csum = 0;
                for(int j = 0; j < c; j++){
                    rsum += matrix[i][j];
                    csum += matrix[j][i];
                }
                //System.out.println(rsum + " " + csum);
                if(rsum >= a && rsum <= b){
                    count++;
                }
                if(csum >= a && csum <= b){
                    count ++;
                }
            }
            System.out.println(count + " ");
            q--;
        }
    }
}