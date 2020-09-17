package Javalab;
import java.util.*;

import javax.net.ssl.SSLContext;

public class StringCheckForRotating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Main String");
        String mainString=sc.next();
        System.out.print("Enter the Clock Wise String");
        String findString=sc.next();
        int a=mainString.length();
        int b=findString.length();
        //System.out.print(b);
        if(a==b)
        {

            String Firstl=findString.substring(b-2, b);
            String Firsts=findString.substring(0,b-2);

            String Secondl=findString.substring(0,2);
            String Seconds=findString.substring(2,b);



            String First=Firstl +""+Firsts;
            String Second=Seconds + "" + Secondl;
            if(First.equals(mainString)==Second.equals(mainString))
            {
                System.out.print("String is Not Matched");
            }
            else
            {
                System.out.println("String is Matched");
            }
        }
        else
        {
            System.out.print("String is Not Matched In Count");
        }
    }

}
