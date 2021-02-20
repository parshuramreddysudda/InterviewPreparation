package automatingFeilds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public Calender() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://Selenium/chromedriver2.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.className("ui-datepicker-trigger")).click();
		List<WebElement> list=driver.findElements(By.className("ui-state-default"));
		
		Iterator<WebElement> it=list.iterator();
		list.forEach(li->{
			if(li.getText().equalsIgnoreCase("23")) {
				li.click();
				return;
			}
		});
	}

}
