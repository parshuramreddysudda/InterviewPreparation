
public class SquareRootOfNumber {

	public static void main(String[] args) {
		int x=2147395599;
		
		System.out.print(findSquare(x));

	}

	private static int findSquare(int x) {
		int left=0,right=x;
		int res=0,mid=0;
		while(left<=right) {
			mid=left+(right-left)/2;
			
			if(mid*mid==x) {
				return mid;
			}
			else if(mid*mid<x) {
				res=mid;
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return res;
	}

}
