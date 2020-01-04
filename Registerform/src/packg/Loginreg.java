package packg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Loginreg
{
	String bpath="http://demo.guru99.com/insurance/v1/index.php";
	WebDriver driver;
	//to click on login button
 @BeforeMethod
	public void openbr() throws InterruptedException
 {
 	System.setProperty("webdriver.chrome.driver","C:\\Users\\QAPLANET1\\Downloads\\jarfiles\\chromedriver.exe");
	driver= new ChromeDriver();
    driver.get(bpath);
	driver.manage().window().maximize();
	Assert.assertEquals(driver.getTitle(),"Insurance Broker System - Login");
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
 @AfterMethod
 public void closebrow()
 {
 	driver.close();
 }	
 @Test
 void login()
 {
	        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gopalsandipeta@gmail.com");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Gopal@123");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			Assert.assertEquals(driver.getTitle(), "Insurance Broker System");
		    driver.findElement(By.xpath("//input[@class='btn btn-danger']")).click();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
 }
 
 
}
