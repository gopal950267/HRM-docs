package packg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Cls {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//https://www.seleniumeasy.com/selenium-tutorials/how-to-get-css-values-using-webdriver***website
		
		String bpath = "http://demo.guru99.com/test/newtours/";
		
        System.setProperty("webdriver.gecko.driver","D:\\selenium\\New folder\\geckodriver.exe");
        
        WebDriver driver = new FirefoxDriver();
        
	    driver.get(bpath);
	
		WebElement googleSearchBtn = driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Selenium')]"));
		
		System.out.println("Color of a button before mouse hover: "	+ googleSearchBtn.getCssValue("color"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(googleSearchBtn).perform();
		
		System.out.println("Color of a button after mouse hover : "	+ googleSearchBtn.getCssValue("color"));
		
	}

}
