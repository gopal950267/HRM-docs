package package1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sequntial 
{
	public static void main(String arg[]) throws InterruptedException
	{
    System.setProperty("webdriver.chrome.driver","C:\\Users\\QAPLANET1\\Downloads\\jarfiles\\chromedriver.exe");
	WebDriver bo=new ChromeDriver();
	bo.manage().window().maximize();
	bo.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	bo.get("http://apps.qaplanet.in/qahrm/login.php");
	String name = bo.getWindowHandle();
	bo.switchTo().window(name);
	bo.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]")).click();
	Thread.sleep(3000);

	bo.close();
	}
}

/*Thread.sleep(5000);
String nam2=bo.getWindowHandle();
bo.switchTo().window(nam2);
bo.findElement(By.xpath("//a[contains(@class,'btn-orange contact-ohrm')]")).click();*/