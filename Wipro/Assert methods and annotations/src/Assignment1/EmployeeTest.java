package Assignment1;

import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 
 */

/**
 * @author parsh
 *
 */
public class   EmployeeTest {
	Employee e = new Employee();
	ArrayList<String> list = new ArrayList<>();
	{
		list.add("Bob");
		list.add("Alice");
		list.add("John");
	}
	
	
//	@Before
//	void before() {
//		System.out.println("before");
//	}
//	
//	@After
//	void after() {
//		System.out.println("after");
//	}

	@Test
	public void testFindName() {
		System.out.println(list);
		assertEquals("Result", "FOUND", e.findName(list, "Alice"));
		System.out.println("test");
	}

}
