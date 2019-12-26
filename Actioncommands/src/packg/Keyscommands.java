package packg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyscommands {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		
		String bpath = "http://www.facebook.com/"; 
		System.setProperty("webdriver.gecko.driver","C:\\Users\\QAPLANET1\\Downloads\\naresh\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();


		driver.get(bpath);
		Thread.sleep(3000);
		Actions keys= new Actions(driver);
		Thread.sleep(3000);
		WebElement txtUsername = driver.findElement(By.id("email"));
		Thread.sleep(3000);
        keys.moveToElement(txtUsername).click();
        keys.keyDown(txtUsername, Keys.SHIFT).perform();
        keys.sendKeys(txtUsername, "hello").perform();
        keys.keyUp(txtUsername, Keys.SHIFT).perform();
        keys.doubleClick(txtUsername);
        keys.contextClick(txtUsername);  //click on right click
		keys.build().perform();
		
			
			
	}

}
