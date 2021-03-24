package automatingFeilds;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public Calender() {
		// TODO Auto-generated constructor stub
	}
	 static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "I://Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.className("ui-datepicker-trigger")).click();
		boolean isMonth=false;
		while(!isMonth) {
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
			isMonth=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/span[1]")).getText().contains("May");
			
		}
		List<WebElement> list=driver.findElements(By.className("ui-state-default"));
		System.out.println(list.size());
		Iterator it=list.iterator();
		Optional<WebElement> result=list.stream().filter(li->li.getText().equalsIgnoreCase("24")).findAny();
		result.get().click();
		driver.close();
	}

}
