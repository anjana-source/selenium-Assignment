package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextBox extends Base{

	public void textBox()
	{
		driver.navigate().to("https://demoqa.com/text-box");
		WebElement fullname=driver.findElement(By.id("userName"));
		fullname.sendKeys("anjana");
		
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("anjana@gmail.com");
		
		WebElement currentaddress=driver.findElement(By.id("currentAddress"));
		currentaddress.sendKeys("kozhikode,kerala,india");
		
		WebElement permanentaddress=driver.findElement(By.id("permanentAddress"));
		permanentaddress.sendKeys("kozhikode,kerala,673009,india");
		
		WebElement submit=driver.findElement(By.id("submit"));
	    submit.click();
	}
	
	
	public static void main(String[] args) {
		TextBox textbox=new TextBox();
		textbox.initializeBrowser();
		textbox.textBox();

	}

}
