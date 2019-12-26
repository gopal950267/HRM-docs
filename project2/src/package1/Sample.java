package package1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample
{
	

	String bpath="http://apps.qaplanet.in/qahrm/login.php";
	WebDriver bo;
	@Test
	  void TC_1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QAPLANET1\\Downloads\\jarfiles\\chromedriver.exe");
		bo=new ChromeDriver();
		bo.get(bpath);
		bo.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]")).click();
		bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//By using window handles
			 Set<String> s1=bo.getWindowHandles();
			 Iterator<String> i1=s1.iterator();
			 String mainwindow =i1.next();
			 String ChildWindow=i1.next();
			 Assert.assertEquals(bo.switchTo().window(ChildWindow).getTitle(), "HR Management System | HR Management Software | OrangeHRM");
			 Thread.sleep(3000);
			 bo.quit();
	  }
}
