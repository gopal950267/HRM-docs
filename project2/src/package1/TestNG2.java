package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2
{
	String bpath="http://apps.qaplanet.in/qahrm/login.php";
	WebDriver bo;
	//valid and valid
	@Test(enabled=true,priority=1,groups="login")
	void Tc1_1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QAPLANET1\\Downloads\\jarfiles\\chromedriver.exe");
		bo=new ChromeDriver();
		bo.get(bpath);
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		Thread.sleep(3000);
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		Assert.assertEquals(bo.getTitle(),"OrangeHRM");
		bo.close();
	}
	//valid and invalid
	@Test(enabled=true,priority=2,groups="login")
    void Tc1_2() throws InterruptedException
    {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QAPLANET1\\Downloads\\jarfiles\\chromedriver.exe");
		bo=new ChromeDriver();
		bo.get(bpath);
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab");
		Thread.sleep(3000);
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		Assert.assertEquals(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(),"Invalid Login");
		Thread.sleep(3000);
		bo.close();
    }
	//invalid and valid
		@Test
	    void Tc1_4() throws InterruptedException
	    {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\QAPLANET1\\Downloads\\jarfiles\\chromedriver.exe");
			bo=new ChromeDriver();
			bo.get(bpath);
			bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet");
			bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
			Thread.sleep(3000);
			bo.findElement(By.xpath("//input[@name='Submit']")).click();
			Assert.assertEquals(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(),"Invalid Login");
			Thread.sleep(3000);
			bo.close();
	    }
	//invalid and invalid
	@Test(enabled=true,priority=3,groups="login")
	 void Tc1_3() throws InterruptedException
	    {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\QAPLANET1\\Downloads\\jarfiles\\chromedriver.exe");
			bo=new ChromeDriver();
			bo.get(bpath);
			bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("");
			Thread.sleep(3000);
			bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
			Thread.sleep(3000);
			bo.findElement(By.xpath("//input[@name='Submit']")).click();
			Assert.assertEquals(bo.switchTo().alert().getText(),"User Name not given!");
			bo.switchTo().alert().accept();
			Thread.sleep(4000);
			bo.close();	
	    }
	@Test(enabled=true,priority=3,groups="login")
	 void Tc2_1() throws InterruptedException
	    {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\QAPLANET1\\Downloads\\jarfiles\\chromedriver.exe");
			bo=new ChromeDriver();
			bo.get(bpath);
			bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
			Thread.sleep(3000);
			bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
			Thread.sleep(3000);
			bo.findElement(By.xpath("//input[@name='Submit']")).click();
			
		
	    }
}
