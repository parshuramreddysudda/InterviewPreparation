package assignment1;

public class ImplClassWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "How was your day today";
		char c = 'a';

		CharacterOccurence lambda = (String st, char l) -> {
			int count = 0;
			for (int i = 0; i < st.length(); i++) {
				if (l == str.charAt(i)) {
					count++;
				}
			}

			return count;
		};

		int result = lambda.findOccurence(str, c);
		System.out.println(c + " occured " + result + " times.");

	}

}