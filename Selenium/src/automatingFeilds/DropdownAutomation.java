package automatingFeilds;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DropdownAutomation {

	public DropdownAutomation() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F://Selenium/chromedriver2.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> window=driver.getWindowHandles();
		Iterator<String>  it=window.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"interview-material-container\"]/div/div[2]/p[2]/strong/a")).getText());
		driver.findElement(By.xpath("//*[@id=\"interview-material-container\"]/div/div[2]/p[2]/strong/a")).getText();
		driver.close();
//		Actions act=new Actions(driver);
//		act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello world").contextClick().build().perform();

	}

}
