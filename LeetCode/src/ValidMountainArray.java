
public class ValidMountainArray {

	public ValidMountainArray() {
		// TODO Auto-generated constructor stub
	}

	public static  main(String[] args) {
		  
		int[] A= {0,1,2,3,4,5,6,7,8};
        int flag=0;
        if(A.length<3) {
        	return false;
        }
        for(int i =0;i<A.length-1;i++){
            if(A[i] > A[i+1]) {
                 flag = i;
                if(flag ==0 || flag ==A.length-1){
                    return false;
                }
                break;
            }
            
        }
        for(int j = flag; j<A.length-1;j++){ //1 
            if(A[j]<= A[j+1]){
                return false;
            }
        }
        return true;

	}

}
