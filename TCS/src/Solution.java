import java.util.Scanner;



/**
 * @author parsh
 *
 */
 class Account {
	private static int id;
    private static double balance;
    private static double interestRate;

    public Account(int id,double balance,double interestRate)
    {
        Account.id=id;
        Account.balance=balance;
        Account.interestRate=interestRate;

    } 
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        Account.id=id;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        Account.balance=balance;
    }
    public double getInterestRate()
    {
        return interestRate;
    }
    public void setInterestRate(double interestRate)
    {
        Account.interestRate=interestRate;
    }

}

public class Solution {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    @SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
	        System.out.println("enter id:");
	        int id=sc.nextInt();
	        
	        
	        System.out.println("enter balance:");
	        double balanace=sc.nextDouble();
	        
	        
	        System.out.println("enter interestrate:");
	        double interestRate=sc.nextDouble();
	        
	        
	        System.out.println("enter no of years:");
	        int noOfYears=sc.nextInt();
	        

			Account a=new Account(id,balanace,interestRate);
			System.out.println("Final Intrest is "+calculateInterest(a,noOfYears));
	}
	

    public static double calculateInterest(Account a, int noOfYears)
    {
        double pervalue=(a.getInterestRate()/100)*noOfYears;
        double finalinterest=10*(a.getInterestRate()+pervalue);
//        System.out.print(a.getBalance());
        return finalinterest;
    }
}
