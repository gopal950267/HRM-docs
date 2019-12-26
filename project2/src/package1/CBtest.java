package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBtest 
{
	String bpath="http://apps.qaplanet.in/qahrm/login.php";
	WebDriver bo;
	@Parameters("browser")
	@BeforeTest 
	public void Crb(String br)
	{
	if(br.equalsIgnoreCase("ff"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\QAPLANET1\\Downloads\\jarfiles\\geckodriver.exe");
		bo= new FirefoxDriver();
		bo.get(bpath);
		System.out.println("running with fire");
			
	}
	else if(br.equalsIgnoreCase("glg"))	
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\QAPLANET1\\Downloads\\jarfiles\\chromedriver.exe");
		bo= new ChromeDriver();
		bo.get(bpath);
		System.out.println("running with gooogle");
	}
	}
	//with valid Login name and valid password
			@Test
			void Tc1_1() throws InterruptedException
			{
				bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
				bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
				Thread.sleep(3000);
				bo.findElement(By.xpath("//input[@name='Submit']")).click();
				Assert.assertEquals(bo.getTitle(),"OrangeHRM");
				bo.close();
			}

			//with valid Login name and invalid password
			@Test(enabled=true, priority=1,dependsOnMethods="Tc1_1")
		    void Tc1_2() throws InterruptedException
		    {
				bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
				bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab");
				Thread.sleep(3000);
				bo.findElement(By.xpath("//input[@name='Submit']")).click();
				Assert.assertEquals(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(),"Invalid Login");
				Thread.sleep(3000);
				bo.close();
		    }

}


