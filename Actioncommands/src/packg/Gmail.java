package packg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QAPLANET1\\Downloads\\naresh\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://accounts.google.com/signin");
	  
	    WebDriverWait wait=new WebDriverWait(driver, 20);
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);   
	    driver.findElement(By.id("identifierId")).sendKeys("gopalsandipeta");
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);   
	    driver.findElement(By.xpath("//span[@class='CwaK9']")).click();
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
	    driver.findElement(By.name("password")).sendKeys("*********");
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
	    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	    /*Actions acr=new Actions(driver);
	    acr.moveToElement(driver.findElement(By.tagName("span"))).perform();
	    driver.findElement(By.tagName("span")).click();*/
	    
	    if(driver.getTitle().equals("Google Account"))
	    {
	    System.out.println("pass");
	    }
	    else
	    {
	    	System.out.println("fail");
	    	
	    }
	    /*Actions acr=new Actions(driver);
	    acr.moveToElement(driver.findElement(By.xpath("//img[@class='gb_ua']"))).perform();
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	   
	    acr.moveToElement(driver.findElement(By.tagName("span"))).click();*/
	    
	}

}
