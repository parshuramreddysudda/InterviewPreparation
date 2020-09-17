/**
 * 
 */
package assignment4;

/**
 * @author parsh
 *
 */
public class Assignment4 {

	/**
	 * 
	 */
	public Assignment4() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
ContactList contactsList = new ContactList();
		
		contactsList.addContact("Bob Biswas", 98310983);
		contactsList.addContact("Police", 100);
		contactsList.addContact("Alice", 98765432);
				
		System.out.println("Police: " + contactsList.doesContactNameExist("Police"));
		System.out.println("98765432: " + contactsList.doesContactNumberExist(98765432));
		
		System.out.println();
		contactsList.listAllContacts();

	}

}
