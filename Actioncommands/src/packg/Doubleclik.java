package packg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclik {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QAPLANET1\\Downloads\\jarfiles\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.manage().window().maximize();
		bo.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		Actions action=new Actions(bo);
		
		action.doubleClick(bo.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"))).perform();
		bo.switchTo().alert().equals("You double clicked me.. Thank You..");
		System.out.println("alert accepted");
		bo.switchTo().alert().accept();
	}

}
