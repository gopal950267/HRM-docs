package packg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dummyreg
{

	String bpath="http://demo.guru99.com/insurance/v1/index.php";
	WebDriver driver;
	@Test
	void Tc1_1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QAPLANET1\\Downloads\\jarfiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(bpath);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[@class='btn btn-default']")).click();
	}
	@Test
	void Tc1_2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QAPLANET1\\Downloads\\jarfiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(bpath);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//click register button
	    driver.findElement(By.xpath("//a[@class='btn btn-default']")).click();
	    //select gender
	    Select oslect=new Select(driver.findElement(By.xpath("//select[@id='user_title']")));
	    oslect.selectByIndex(1);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//give values of username and surname
	    driver.findElement(By.xpath("//input[@id='user_firstname']")).sendKeys("harikrishna");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id='user_surname']")).sendKeys("jaikrishna");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id='user_phone']")).sendKeys("jaikrishna");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    //select date of birth
		 Select oslect1=new Select(driver.findElement(By.xpath("//select[@id='user_dateofbirth_1i']")));
		 oslect1.selectByVisibleText("1995");
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 Select oslect2=new Select(driver.findElement(By.xpath("//select[@id='user_dateofbirth_2i']")));
		 oslect2.selectByVisibleText("December");
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 Select oslect3=new Select(driver.findElement(By.xpath("//select[@id='user_dateofbirth_3i']")));
		 oslect3.selectByVisibleText("23");
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 
		 //select radio button
		 WebElement radio=driver.findElement(By.xpath("//input[@id='licencetype_f']"));
		 radio.click();
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 //select acadamic
         Select oslect4=new Select(driver.findElement(By.xpath("//select[@id='user_licenceperiod']")));
		 oslect4.selectByVisibleText("2");
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 //select occupation
		 Select oslect5=new Select(driver.findElement(By.xpath("//select[@id='user_occupation_id']")));
		 oslect5.selectByVisibleText("Engineer");
		 //finally selected remaining options
		 driver.findElement(By.xpath("//input[@id='user_address_attributes_street']")).sendKeys("sr nagar");
	     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@id='user_address_attributes_city']")).sendKeys("hyderabad");
	     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@id='user_address_attributes_county']")).sendKeys("india");
	     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 
	    driver.findElement(By.xpath("//input[@id='user_address_attributes_postcode']")).sendKeys("500038");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id='user_user_detail_attributes_email']")).sendKeys("gopalsandipeta@gmail.com");
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='user_user_detail_attributes_password']")).sendKeys("Gopal@1234");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='user_user_detail_attributes_password_confirmation']")).sendKeys("Gopal@1234");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	
	}

	
	
}
