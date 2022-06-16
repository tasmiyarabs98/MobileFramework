package MobileApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Home_page extends Launch{
	
	@Test(priority = 1)
	public void Home() throws InterruptedException
	{	
	WebElement var = driver.findElement(By.id("navbarDropdown"));
	Assert.assertTrue(var.isDisplayed());
	JavascriptExecutor j = (JavascriptExecutor) driver;
	j.executeScript("window.scrollBy(0,700)");
	Thread.sleep(2000);
	 driver.findElement(By.xpath("(//a[@class='btn btn-primary '])[1]")).click();
	
	WebElement el = driver.findElement(By.id("navbarDropdown"));
	el.click();
	driver.findElement(By.linkText("Order")).click();
	Set<String> window = driver.getWindowHandles();
	List<String> list= new ArrayList<String>(window);
	driver.switchTo().window(list.get(1));
	System.out.println(driver.getTitle());
	driver.close();
	driver.switchTo().window(list.get(0));
	Thread.sleep(2000);
	el.click();	
	driver.findElement(By.linkText("Contact Us")).click();
	Set<String> win = driver.getWindowHandles();
	List<String> ls= new ArrayList<String>(win);
	driver.switchTo().window(ls.get(1));
	System.out.println(driver.getTitle());
	driver.close();
	driver.switchTo().window(list.get(0));
	Thread.sleep(1000);
	driver.findElement(By.xpath("//footer[@class='footer'] //a[.='Home']")).click();
	

	//driver.findElement(By.id("btn-back-to-top")).click();


	}
	
}
