import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BasicClass {

	public BasicClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws MalformedURLException {
		
		
		DesiredCapabilities desc = new DesiredCapabilities();
		desc.setBrowserName("chrome");
		desc.setPlatform(Platform.WINDOWS);
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.11:4444/wd/hub"),desc);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		System.out.println(driver.getCurrentUrl());
		
		
	}

}
