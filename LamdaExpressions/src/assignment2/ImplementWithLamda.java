package assignment2;

public class ImplementWithLamda {

	public static void main(String[] args) {

		String words="This is the word in the strings";
		WordCount lamda=(String str)->{
			
			 if (str == null || str.isEmpty())
		            return 0;

		        String[] wordsLength = str.split("\\s+");
		        
		        return wordsLength.length;
		};
		int result=lamda.findOccurence(words);
		System.out.println("Words count is  "+result);
	}

}
