package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class RadioButton extends Base {
	public void radioButton()
	{
		driver.navigate().to("https://demoqa.com/radio-button");	
		WebElement xpath1=driver.findElement(By.xpath("//label[@class='custom-control-label']"));
		xpath1.click();
		
	}


	public static void main(String[] args) {
		
		RadioButton radiobutton=new RadioButton();
		radiobutton.initializeBrowser();
		radiobutton.radioButton();

	}

}
