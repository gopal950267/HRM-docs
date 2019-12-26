package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Samp 
{
	String bpath="http://apps.qaplanet.in/qahrm/login.php";
	WebDriver bo;
	@Test
	void Tc1() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\QAPLANET1\\Downloads\\jarfiles\\geckodriver.exe");
		bo= new FirefoxDriver();
	bo.get(bpath);
	bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	Thread.sleep(3000);
	bo.findElement(By.xpath("//input[@name='Submit']")).click();
	Assert.assertEquals(bo.getTitle(),"OrangeHRM");
	bo.close();
	}
}
