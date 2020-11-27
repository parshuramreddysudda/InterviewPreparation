
public class LP_Practice_EncodingThreeStrings {

	public static void main(String[] args) {

		String input1="John",input2="Johny",input3="Janardhan";
		String input1First="";
		String input1Second="";
		String input1Three="";
		String input2First="";
		String input2Second="";
		String input2Three="";
		String input3First="";
		String input3Second="";
        String input3Three="";

		int first=input1.length()%3;
		int firstDiv=input1.length()/3;
		 if(first==0){
//			 System.out.println("Ece");
			 input1First=input1.substring(0,firstDiv);
			 input1Second=input1.substring(firstDiv,(firstDiv)*2);
			 input1Three=input1.substring((firstDiv)*2,input1.length());
		 }
		 else if(first==1){
			 input1First=input1.substring(0,firstDiv);
			 input1Second=input1.substring(firstDiv,(firstDiv)*2+1);
			 input1Three=input1.substring((firstDiv)*2+1,input1.length());
		 }
		  else{
			 input1First=input1.substring(0,firstDiv+1);
			 input1Second=input1.substring(firstDiv+1,(firstDiv)*2+1);
			 input1Three=input1.substring((firstDiv)*2+1,input1.length());
		 }
		first=input2.length()%3;
		firstDiv=input2.length()/3;
		if(first==0){
//			 System.out.println("Ece");
			 input2First=input2.substring(0,firstDiv);
			 input2Second=input2.substring(firstDiv,(firstDiv)*2);
			 input2Three=input2.substring((firstDiv)*2,input2.length());
		 }
		 else if(first==1){
			 input2First=input2.substring(0,firstDiv);
			 input2Second=input2.substring(firstDiv,(firstDiv)*2+1);
			 input2Three=input2.substring((firstDiv)*2+1,input2.length());
		 }
		  else{
			 input2First=input2.substring(0,firstDiv+1);
			 input2Second=input2.substring(firstDiv+1,(firstDiv)*2+1);
			 input2Three=input2.substring((firstDiv)*2+1,input2.length());
		 }
		first=input3.length()%3;
		firstDiv=input3.length()/3;
		if(first==0){
//			 System.out.println("Ece");
			 input3First=input3.substring(0,firstDiv);
			 input3Second=input3.substring(firstDiv,(firstDiv)*2);
			 input3Three=input3.substring((firstDiv)*2,input3.length());
		 }
		 else if(first==1){
			 input3First=input3.substring(0,firstDiv);
			 input3Second=input3.substring(firstDiv,(firstDiv)*2+1);
			 input3Three=input3.substring((firstDiv)*2+1,input3.length());
		 }
		  else{
			 input3First=input3.substring(0,firstDiv+1);
			 input3Second=input3.substring(firstDiv+1,(firstDiv)*2+1);
			 input3Three=input3.substring((firstDiv)*2+1,input3.length());
		 }

		String FirstResult=input1First+input2First+input3First;
		String SecondResult=input2Second+input2Second+input3Second;
		String ThirdResult=input1Three+input2Three+input3Three;

		char[] array=new char[ThirdResult.length()];
		for(int i=0;i<ThirdResult.length();i++){
			char c=ThirdResult.charAt(i);
			if(Character.isUpperCase(c)){
				array[i]=Character.toLowerCase(c);
			}else{
				array[i]=Character.toUpperCase(c);
			}
		}
		ThirdResult=new String(array);

		 System.out.println("Input1 is  "+input1First+" Input2 is "+input1Second+" Inout three  " +input1Three);
		 System.out.println("Input1 is  "+input2First+" Input2 is "+input2Second+" Inout three  " +input2Three);
		 System.out.println("Input1 is  "+input3First+" Input2 is "+input3Second+" Inout three  " +input3Three);


	}

}
