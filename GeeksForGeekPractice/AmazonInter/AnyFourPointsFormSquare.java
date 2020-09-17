package Javalab;
import java.lang.*;
import java.util.*;

public class AnyFourPointsFormSquare {

    public static void main(String[] args) {

        System.out.println("Enter Number Serially For Finding The Square");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number For First Value");
        int Firsta=s.nextInt();
        int Firstb=s.nextInt();
        System.out.println("Enter Number For Second Value");
        int Seconda=s.nextInt();
        int Secondb=s.nextInt();
        System.out.println("Enter Number For Third Value");
        int Thirda=s.nextInt();
        int Thirdb=s.nextInt();
        System.out.println("Enter Number For Fourth Value");
        int Fourtha=s.nextInt();
        int Fourthb=s.nextInt();



        if(Division(Firsta,Firstb,Seconda,Secondb)==Division(Thirda,Thirdb,Fourtha,Fourthb))
        {
            if(Division(Firsta,Firstb,Fourtha,Fourthb)==Division(Seconda,Secondb,Thirda,Thirdb))
                System.out.print("The Given Points Form Square");
            else
            {
                System.out.print("Its is Not Square");
            }
        }
        else
        {
            System.out.print("Its is Not Square");
        }
    }
    public static double Division(int a,int b,int c,int d)

    {
        double Result=Math.sqrt(((Math.pow((a-c), 2))-Math.pow((b-d),2)));
        return Result;
    }

}
