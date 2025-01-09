package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	WebDriver driver;	
	public void initializeBrowser()
	{
	 driver=new ChromeDriver(); 
	 driver.get("https://demoqa.com/");
	 driver.manage().window().maximize(); // window maximization
		
	}
	

		public static void main(String[] args) {
			Base base=new Base();
			base.initializeBrowser();
		

	}

}
