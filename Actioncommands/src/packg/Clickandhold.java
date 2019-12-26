package packg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickandhold 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\QAPLANET1\\Downloads\\naresh\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("http://demo.guru99.com/test/drag_drop.html");					
	   
	//WebElement which needs to be right clicked
	WebElement rtClickElement = driver.findElement(By.xpath("//a[contains(text(),'Insurance Project')]"));
	 
	//Generating a Action to perform context click or right click
	Actions rightClickAction = new Actions(driver).clickAndHold(rtClickElement);
	 
	//Performing the right click Action generated
	rightClickAction.build().perform();
	}
}
