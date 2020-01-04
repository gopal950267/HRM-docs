package packg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\QAPLANET1\\Downloads\\naresh\\geckodriver.exe");
	    WebDriver bo=new FirefoxDriver();
	    bo.get("http://demo.guru99.com/test/drag_drop.html");					
	    
		//Element which needs to drag.    		
	     WebElement From=bo.findElement(By.xpath("//a[contains(text(),'BANK')]"));	
	     
	     //Element on which need to drop.		
	     WebElement To=bo.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));					
	     		
	     //Element which needs to drag
	     WebElement From1=bo.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
	     
	     WebElement To1=bo.findElement(By.xpath("//ol[@id='amt7']"));	
	     
	     //Using Action class for drag and drop.		
	     Actions act=new Actions(bo);					

	//Dragged and dropped.		
	     // Thus build() method is used compile all the listed actions into a single step.
	     act.dragAndDrop(From, To).build().perform();		
	     act.dragAndDrop(From1, To1).build().perform();
		
		
		
	}

}
