/**
 * 
 */
package Assignment2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author parsh
 *
 */
public class PalindromeTest {
	Palindrome myunit = new Palindrome();

	@Test
	public void testPalindromeCheck() {
		assertEquals("Result:", true, myunit.palindromeCheck("madam"));
		assertEquals("Result:", true, myunit.palindromeCheck("mom"));
		assertEquals("Result:", true, myunit.palindromeCheck("dad"));
		assertEquals("Result:", true, myunit.palindromeCheck("malayalam"));
		assertEquals("Result:", false, myunit.palindromeCheck("kerala"));
		assertTrue("Result: ", myunit.palindromeCheck("madam"));
		assertTrue("Result: ", myunit.palindromeCheck("mom"));
		assertTrue("Result: ", myunit.palindromeCheck("dad"));
		assertTrue("Result: ", myunit.palindromeCheck("malayalam"));
		assertFalse("Result: ", myunit.palindromeCheck("kerala"));
		assertFalse("Result: ", myunit.palindromeCheck("india"));
	}

}