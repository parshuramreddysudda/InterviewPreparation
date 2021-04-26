package practice;

import java.util.List;

public class Hammering {

	public static void main(String[] args) {
		List<String> list1;
	}

	int hammingDist(List<String> candidateStrings, List<String> keyString) {
		int count = 0;
		for (int i = 0; i < candidateStrings.size(); i++) {
			if (candidateStrings.get(i).charAt(i) != (keyString.get(i).charAt(i)))
				count++;
		}
		return count;
	}

}
