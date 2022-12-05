package Mous_Click_keybord;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/OnClick_HTML_File/DragAndDrop.html");
		
	//draganddrop method two paramatre allowed 		
		WebElement dragDrop = driver.findElement(By.id("draggable"));
		
		// locating target element 
		WebElement drophere = driver.findElement(By.id("droppable"));
		//create a action class
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(dragDrop, drophere);
		builder.perform();
	}

}
