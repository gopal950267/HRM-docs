package package2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dummy2 
{
	String bpath="http://apps.qaplanet.in/qahrm/login.php";
	WebDriver bo;
	//to click on login button
    @BeforeMethod
	public void login() throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\QAPLANET1\\Downloads\\jarfiles\\chromedriver.exe");
		bo= new ChromeDriver();
		bo.get(bpath);
		bo.manage().window().maximize();
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		Thread.sleep(3000);
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		Thread.sleep(3000);
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		Assert.assertEquals(bo.getTitle(),"OrangeHRM");
		 bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
    @AfterMethod
    public void close()
    {
    	bo.close();
    }
     //verify functionality of 'admin' link
    //admin=company Info=General
    		   @Test(enabled=true, priority=5, groups="admin")
    		 public void Tc2_5() throws InterruptedException
    		 {
    			 Actions acr=new Actions(bo);
    			 acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
    			 bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    			 acr.moveToElement(bo.findElement(By.xpath("//a[@class='l2_link parent job']//span[contains(text(),'Job')]"))).perform();
    			 Thread.sleep(5000);
    			 acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Job Titles')]"))).perform();
    			 Thread.sleep(5000);
    			 bo.findElement(By.xpath("//span[contains(text(),'Job Titles')]")).click();
    			 Thread.sleep(5000);
    			 Assert.assertEquals(bo.getTitle(),"OrangeHRM");
    			 bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    		 } 

}
