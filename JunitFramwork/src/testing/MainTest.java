package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class MainTest {
	static Main main = new Main();

	@BeforeClass
	public static void setup() {
		boolean text = main.checkDriver();
		assertEquals(true, text);
	}

	@Test
	void testTitle() {
		String text = main.testTitle();
		assertEquals("Your Store", text);
	}

	@Test
	void canonImageTest() {
		assertEquals(main.canonImage(), "Canon EOS 5D");
	}

	@Test
	void quantityandCartTest() {
		assertEquals(main.quantityandCart("456"), "456");
	}

	@Test
	void checkAlertMessageTest() {
		assertEquals(main.checkAlertMessage(), true);
	}

	@Test
	void getValueTest() throws InterruptedException {
		String value = main.getValue();
		System.out.println("Value is " + value);
		if (Integer.parseInt(value) > 200)
			System.out.println("Logout Not needed");
		else
			System.out.println("Logout required");
//		value.contains("")
	}

	@Test
	void checkSearchStringTest() {
		String checkString = "Login";
		String text = main.checkSearchString(checkString);
		assertEquals(text, checkString);
	}

	@Test
	void beforeLogin() {
		String text = main.beforeLogin();
		assertEquals("Account Login", text);
	}

	@AfterClass
	void checkDriver() {
		assertEquals(true, main.checkDriver());
	}
}
