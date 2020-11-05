import java.util.Arrays;

public class RemoveMultiples {

	public RemoveMultiples() {
		// TODO Auto-generated constructor stub
	}
	public static boolean main(String args[]) {
	       boolean result=false;
	       int[] arr= {1,2,3,4,5,7,8,6,2};
	        for(int i=0;i<arr.length;i++){
	   

	            for(int j=0;j<arr.length;j++){
	                int k = 0;
					if(i!=k&&arr[i]>arr[j]){
	                    if(arr[i]*2==arr[j]){
	                        result=true;
	                        break;
	                    }
	                }
	            }
	            if(result){
	                break;
	            }
	        }
	return result;
	}

}
