/**
 * 
 */
package bean;

/**
 * @author parsh
 *
 */
abstract class Account {
	double interestRate;
	double amount;
	
	abstract double calculateInterest();
}