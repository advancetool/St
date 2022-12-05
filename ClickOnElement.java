package Mous_Click_keybord;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickOnElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/OnClick_HTML_File/Selectable.html");
		WebElement one =driver.findElement(By.name("one"));
		WebElement eleven =driver.findElement(By.name("eleven"));
		WebElement five =driver.findElement(By.name("five "));
		
		Actions builder = new Actions(driver);
	  /*  builder.click(one);
	    builder.perform();
	   
		builder.click(eleven);
		builder.perform();
		
		builder.click(five);
		builder.perform();*/
		
		builder.click(one).click(eleven).click(five);//composite Action
		builder.perform();

	}

}
