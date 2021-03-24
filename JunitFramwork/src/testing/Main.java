package testing;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

	public static void main(String[] args) {

	}

	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "I://Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		return driver;
	}

	public boolean checkDriver() {
		System.setProperty("webdriver.chrome.driver", "I://Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		return (driver != null);
	}

	public String beforeLogin() {
		System.setProperty("webdriver.chrome.driver", "I://Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.className("dropdown")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		String title = driver.getTitle();
		driver.quit();
		return title;

	}

	public String checkSearchString(String text) {
		System.setProperty("webdriver.chrome.driver", "I://Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("dropdown")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		driver.findElement(By.id("input-email")).sendKeys("emailqwe@email.com");
		driver.findElement(By.id("input-password")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys(text);
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys(Keys.ENTER);
		String text1 = driver.findElement(By.id("input-search")).getAttribute("value");
		driver.quit();
		return text1;

	}

	public String testTitle() {
		System.setProperty("webdriver.chrome.driver", "I://Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		driver.quit();
		return title;
	}

	public String canonImage() {
		System.setProperty("webdriver.chrome.driver", "I://Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[4]/div/div[1]/a/img")).click();
		String text = driver.findElements(By.tagName("h1")).get(1).getText();
		driver.quit();
		return text;
	}

	public String quantityandCart(String num) {
		System.setProperty("webdriver.chrome.driver", "I://Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[4]/div/div[1]/a/img")).click();
		driver.findElement(By.id("input-quantity")).clear();
		driver.findElement(By.id("input-quantity")).sendKeys(num);
		String text1 = driver.findElement(By.id("input-quantity")).getAttribute("value");
		driver.quit();
		return text1;
	}

	public boolean checkAlertMessage() {
		System.setProperty("webdriver.chrome.driver", "I://Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/a/img")).click();
		driver.findElement(By.id("input-quantity")).clear();
		driver.findElement(By.id("input-quantity")).sendKeys("34");
		driver.findElement(By.id("button-cart")).click();
		boolean be = driver.findElement(By.xpath("//*[@id=\"product-product\"]/div[1]")).isDisplayed();
		driver.quit();
		return be;
	}

	public String getValue() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "I://Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/a/img")).click();
		driver.findElement(By.id("input-quantity")).clear();
		driver.findElement(By.id("input-quantity")).sendKeys("34");
		driver.findElement(By.id("button-cart")).click();
		driver.findElement(By.id("cart-total")).getText();
		Thread.sleep(2000);
		String text = driver.findElement(By.id("cart-total")).getText();
		driver.quit();
		return text.substring(text.indexOf('$')+1,text.indexOf('.')).replace(",", "");
	}

	public String Login() {
		System.setProperty("webdriver.chrome.driver", "I://Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.className("dropdown")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		driver.findElement(By.id("input-email")).sendKeys("emailqwe@email.com");
		driver.findElement(By.id("input-password")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		String title = driver.getTitle();
		driver.quit();
		return title;
	}
}