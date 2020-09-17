
public class ReplaceElementsGreater {

	public ReplaceElementsGreater() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		int[] arr = { 17, 18, 5, 4, 6 ,1};
		int rightMax = -1, newMax = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			newMax = Math.max(arr[i], rightMax);
			arr[i] = rightMax;
			rightMax = newMax;

		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
