package automatingFeilds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownAutomation {

	public DropdownAutomation() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F://Selenium/chromedriver2.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Hacker");
		driver.findElement(By.xpath("//*[@id=\"alertbtn\"]")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Hacker");
		driver.findElement(By.xpath("//*[@id=\"confirmbtn\"]")).click();
		driver.switchTo().alert().dismiss();
		driver.close();

	}

}
