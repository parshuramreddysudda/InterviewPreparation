import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "I://Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("dropdown")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		driver.findElement(By.id("input-email")).sendKeys("emailqwe@email.com");
		driver.findElement(By.id("input-password")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("p");
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys(Keys.ENTER);
		Select drop=new Select(driver.findElement(By.name("category_id")));
		drop.selectByValue("28");
		driver.findElement(By.className("checkbox-inline")).click();
		driver.findElement(By.id("input-search")).click();
		drop.selectByValue("24");
		Select sort=new Select(driver.findElement(By.id("input-sort")));
		sort.selectByVisibleText("Price (High > Low)");
		List<WebElement> list=driver.findElements(By.className("product-thumb"));
		for(int i=0;i<3;i++) {
			list.get(i).findElements(By.tagName("button")).get(2).click();
		}
		list.get(0).findElements(By.tagName("a")).get(0).click();
		driver.findElement(By.id("button-cart")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]")).click();
		List<WebElement> alink = driver.findElements(By.tagName("a"));
		System.out.println(alink.get(0).getText());
		Iterator<WebElement> it = alink.iterator();
		for (int i = 0; i < alink.size(); i++) {
			if (alink.get(i).getText().equalsIgnoreCase("Specials")) {
				alink.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("list-view")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		for (int i = 0; i < alink.size(); i++) {
			if (alink.get(i).getText().equalsIgnoreCase("Logout")) {
				alink.get(i).click();
				break;
			}
		}
		
	}

}
