package packg;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Pg2
{
	public static void main(String[] args) 
	{
	String bpath = "http://www.facebook.com/"; 

    System.setProperty("webdriver.gecko.driver","D:\\selenium\\New folder\\geckodriver.exe");
    
	WebDriver driver = new FirefoxDriver();

	driver.get(bpath);
	
	WebElement txtUsername = driver.findElement(By.id("email"));

	Actions builder = new Actions(driver);
	
	org.openqa.selenium.interactions.Action seriesOfActions = builder.moveToElement(txtUsername).click().keyDown(txtUsername, Keys.SHIFT).sendKeys(txtUsername, "hello").keyUp(txtUsername, Keys.SHIFT).doubleClick(txtUsername).contextClick().build();
		
	seriesOfActions.perform() ;

	}
}
