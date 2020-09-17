import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LargestNumberFromArray {

	public LargestNumberFromArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strarr;
        for(int t=Integer.parseInt(br.readLine()); t>0; t--)
        {
            br.readLine();
            strarr = br.readLine().split(" ");
            Arrays.sort(strarr, ((x,y)->
            (y+x).compareTo((x+y))
            ));
            System.out.println(String.join("",strarr));
        }

	}

}
