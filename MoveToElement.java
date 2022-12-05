package Mous_Click_keybord;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/OnClick_HTML_File/Sortable.html");
		//locate title 3
		WebElement three =driver.findElement(By.name("three"));
		//locate title five 
		WebElement five =driver.findElement(By.name("five "));
				
		Actions builder= new Actions(driver);
		builder.moveToElement(three).clickAndHold().release(five);
		builder.perform();
		
		
		

	}

}
