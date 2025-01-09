package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends Base {
	
	public void checkBox()
	{
		driver.navigate().to("https://demoqa.com/checkbox");
	   WebElement check=driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
	   check.click();
	}

	public static void main(String[] args) {
		
		CheckBox checkbox=new CheckBox();
		checkbox.initializeBrowser();
		checkbox.checkBox();

	}

}
