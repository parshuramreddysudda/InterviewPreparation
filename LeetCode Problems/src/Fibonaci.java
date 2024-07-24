
public class Fibonaci {

	public static void main(String[] args) {


		int n=10;
		 int[] fb=new int[n+1];
	        
	        if(n==0){
//	            return 0;
	        }
	        if(n==1||n==2){
//	            return 1;
	        }
	        fb[1]=1;
	        fb[2]=1;
		
		for(int i=3;i<=n;i++) {
			fb[i]=fb[i-1]+fb[i-2];
		}
		System.out.print(fb[n]);

	}

}
