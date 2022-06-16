package MobileApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Launch {
	public WebDriver driver;
	@BeforeSuite
	public void Appliction_Lunch()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://mobileworld.azurewebsites.net/");
	}

	
	@AfterSuite
	public void close_Application()
	{
		driver.quit();
	}
}
