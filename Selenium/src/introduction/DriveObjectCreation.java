package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriveObjectCreation {


	public static void main(String[] args) {
		 
//		Creating an object for Chrome Browser
		System.setProperty("webdriver.chrome.driver", "F://Selenium/chromedriver2.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		System.out.print(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("192.168.0.a");
		
//		driver.close() ;
	}

}
