import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

class BasicClassTest {

	@Test
	void test1() throws MalformedURLException {
		DesiredCapabilities desc = new DesiredCapabilities();
		desc.setBrowserName("chrome");
		desc.setPlatform(Platform.WINDOWS);
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.11:4444/wd/hub"),desc);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		System.out.println(driver.getCurrentUrl());
	}
	void test2() throws MalformedURLException {
		DesiredCapabilities desc = new DesiredCapabilities();
		desc.setBrowserName("chrome");
		desc.setPlatform(Platform.WINDOWS);
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.11:4444/wd/hub"),desc);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.className("dropdown")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		driver.findElement(By.id("input-email")).sendKeys("emailqwe@email.com");
		driver.findElement(By.id("input-password")).sendKeys("1234");
	}

}
