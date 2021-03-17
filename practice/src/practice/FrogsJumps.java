package practice;

public class FrogsJumps {

	public FrogsJumps() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 5, 5, 2, 6};
		System.out.println(Solve(arr));
		
	}
    public static int Solve(int[] arr)
    {
        // save the current height as the start of the array
        var currentHeight = arr[0];

        // max used to save the current maximum distance
        var max = 0;
        
        // the location of the previous peak that we detected. Start at index 0.
        var prevPeak = 0;

        var i = 0;


        var goingUp = false;

        var currentPeakStart = 0;


        while (i < arr.length-1)
        {
            if ((!goingUp && currentHeight >= arr[i+1]) || (goingUp && currentHeight <= arr[i+1]))
            {
                if (goingUp && currentHeight < arr[i + 1])
                {
                    currentPeakStart = i + 1;
                }
                currentHeight = arr[i + 1];
                i++;
            }
            else if (!goingUp)

            {
                goingUp = true;
            }
            else if (goingUp)
            {
                var distance = i - prevPeak;

                max = Math.max(max, distance);
                if (i != currentPeakStart)
                {
                    prevPeak = currentPeakStart;
                }
                else
                {
                    prevPeak = i;
                }

                // reached peak so that means the next step is to walk down the slope.
                goingUp = false;
            }
        }

        // final calculation as the last location in the histogram is the final peak.
        var d = i - prevPeak;
        max = Math.max(max, d);

        return max;
    }
}