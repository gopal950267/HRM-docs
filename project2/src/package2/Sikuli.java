package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli {

	public static void main(String[] args) throws FindFailed, InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QAPLANET1\\Downloads\\jarfiles\\chromedriver.exe");
    	WebDriver bo= new ChromeDriver();
		bo.get("http://apps.qaplanet.in/qahrm/login.php");
		Screen sc=new Screen();
		Pattern ud=new Pattern("C:\\Users\\QAPLANET1\\Desktop\\scshots\\log.PNG");
		Pattern pwd=new Pattern("C:\\Users\\QAPLANET1\\Desktop\\scshots\\password.PNG");
		Pattern lg=new Pattern("C:\\Users\\QAPLANET1\\Desktop\\scshots\\uid.PNG");
		sc.type(ud,"qaplanet1");
		Thread.sleep(3000);
		sc.type(pwd, "lab1");
		Thread.sleep(3000);
		sc.click(lg);
		
	}

}
