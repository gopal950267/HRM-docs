package packg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick 
{
	public static void main(String[] args) throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\QAPLANET1\\Downloads\\jarfiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
   driver.get("https://demoqa.com/tooltip-and-double-click/");
  
  driver.manage().window().maximize();
   Actions actions = new Actions(driver);
   Thread.sleep(3000);
	 
   
  WebElement btnElement = driver.findElement(By.id("rightClickBtn"));
  
   Thread.sleep(3000);
   
   
   actions.contextClick(btnElement).perform();
   
   Thread.sleep(3000);
   
   System.out.println("Right click Context Menu displayed");
   
   Thread.sleep(3000);
	
 
   WebElement elementOpen = driver.findElement(By.xpath(".//div[@id='rightclickItem']/div[1]"));
   elementOpen.click(); 
   
   
   Thread.sleep(3000);
   
   driver.switchTo().alert().accept();
   
   Thread.sleep(3000);
   
   System.out.println("Right click Alert Accepted");
   
   driver.close();
}
}
