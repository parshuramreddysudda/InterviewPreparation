import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'getSpecialSubstring' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     *  3. STRING charValue
     */

    public static int getSpecialSubstring(String s, int k, String charValue) {
       
       int spe=0,nor=0,specTemp=0,norTemp=0,res=1;
       char[] disArray= new char[100];
       char[] alpha = new char[26];
       for(int i = 0; i < 26; i++){
            alpha[i] = (char)(97 + i);
           }

        char[] spec=new char[26];
        char[] norm=new char[26];


       for(int i=0;i<26;i++)
       {
             if(charValue.charAt(i)=='0')
             {
                 norm[nor]=alpha[i];
                 nor++;
             }
             else{
                 spec[spe]=alpha[i];
                 spe++;
             }
       }
        
        int l=0;
       for(int i=0;i<s.length();i++)
       {
           for(int f=0;f<norm.length;f++)
           {
                if(s.charAt(i)==norm[f])
                {

                    norTemp++;
                    disArray[l]='n';
                    l++;
                } 
           }
            for(int f=0;f<spec.length;f++)
           {
                if(s.charAt(i)==spec[f])
                {
                    specTemp++;
                    disArray[l]='s';
                    l++;
                }
                
           }
                
       }
       int strNorm=0,strSpec=0;

       String subInput = new String("");

       for(int i=0;i<disArray.length;i++)
            subInput+=disArray[i]; 

//  System.out.println(subInput);


        for(int i=0;i<s.length();i++)
        {
            strNorm=0;strSpec=0;

            String sub= subInput.substring(i);
            System.out.println(sub);
            for(int j=0;j<sub.length();j++)
            {
               if(sub.charAt(j)=='n')
               {
                strNorm++;
                    
               }
               else
               {
                   strSpec++;
               }

            }
            
            if(strNorm==k)  
            {
                res=sub.length();
                System.out.println("String is "+strNorm+"res"+res);
                
            }  
        }
       System.out.println(norTemp);
        System.out.println(res);

     return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String charValue = bufferedReader.readLine();

        int result = Result.getSpecialSubstring(s, k, charValue);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
