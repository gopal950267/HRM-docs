package packg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cbtest 
{
	String bpath="http://demo.guru99.com/insurance/v1/index.php";
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void Crb(String br)
	{
	if(br.equalsIgnoreCase("ff"))
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\QAPLANET1\\Downloads\\jarfiles\\geckodriver.exe");
		driver= new FirefoxDriver();
	    driver.get(bpath);
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	System.out.println("running with fire");
			
	}
	else if(br.equalsIgnoreCase("gg"))	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QAPLANET1\\Downloads\\jarfiles\\chromedriver.exe");
		driver= new ChromeDriver();
	    driver.get(bpath);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("running with gooogle");
	}
	}
@AfterTest
public void clos()
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
