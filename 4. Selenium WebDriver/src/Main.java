import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "I://Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.className("dropdown")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		driver.findElement(By.id("input-email")).sendKeys("emailqwe@email.com");
		driver.findElement(By.id("input-password")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("samsung");
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys(Keys.ENTER);
		Select drop=new Select(driver.findElement(By.name("category_id")));
		drop.selectByValue("28");
		driver.findElement(By.className("checkbox-inline")).click();
		driver.findElement(By.id("input-search")).click();
		drop.selectByValue("24");
		Select sort=new Select(driver.findElement(By.id("input-sort")));
		sort.selectByVisibleText("Price (High > Low)");
		
		
		

	}

}
