package automatingFeilds;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecution {

	public JSExecution() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "F://Selenium/chromedriver2.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://reactjs.org/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,4566)");
		

	}

}
