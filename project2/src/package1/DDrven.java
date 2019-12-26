package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDrven
{
	String bpath="http://apps.qaplanet.in/qahrm/login.php";
	WebDriver bo;
	@Test(dataProvider = "LoginCredentials")
	void Tc1(String Uid, String Pwd)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\QAPLANET1\\Downloads\\jarfiles\\chromedriver.exe");
	bo= new ChromeDriver();
	bo.get(bpath);	
	bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys(Uid);
	bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(Pwd);
	bo.findElement(By.xpath("//input[@name='Submit']")).click();
	Assert.assertEquals(bo.getTitle(),"OrangeHRM");
	bo.close();
	}
  @DataProvider
  public Object[][] LoginCredentials()
  {
	Object[][] cred=new Object[4][2];
	
	cred[0][0]="qaplanet1";
    cred[0][1]="lab1";
			  
    cred[1][0]="qaplanet1";
    cred[1][1]="lab1";		  
  
    cred[2][0]="qaplanet1";
    cred[2][1]="lab1";
    
    cred[3][0]="qaplanet1";
    cred[3][1]="lab1";
	return cred ;
  
  }
}
