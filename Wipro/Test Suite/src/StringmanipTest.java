import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * 
 */

/**
 * @author parsh
 *
 */
	@RunWith(Parameterized.class)
	public class StringmanipTest {
		public	String datum;
		public	String expected;
		
		public StringmanipTest(String datum, String expected) {
			this.datum = datum;
			this.expected =	expected;
		}
		
		
		@Parameters
		public static Collection<Object[]> generateData() {
			Object[][] data	= new Object[][] {
				{"Smita", "SMITA"},
				{"smita", "SMITA"},
				{"SMitA", "SMITA"},
				{"SmitA", "SMITA"}
			};
			
			return Arrays.asList(data);
		}
		
		@Test
		public void testUpperCase() {
			StringManip s = new StringManip(this.datum);
			String actualResult = s.upperCase();
			assertEquals(actualResult, this.expected);
		}

	}
	
