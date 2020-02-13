package DataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testing {
	WebDriver driver;
	@Test(priority=1)
	public void Sample()
	{
		String url="https://www.youtube.com/";
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("hellowworld");
		
	}

}
