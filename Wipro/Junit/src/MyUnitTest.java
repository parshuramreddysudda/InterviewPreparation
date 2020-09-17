import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 */

/**
 * @author parsh
 *
 */
public class MyUnitTest {

	@Test
	public void testStringConcat() {
		PalindromeTest myUnit = new PalindromeTest();
		assertEquals("Result", "HelloWorld", myUnit.stringConcat("Hello", "World"));
	}

}