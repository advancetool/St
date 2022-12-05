package Mous_Click_keybord;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragandDropBy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/OnClick_HTML_File/DragMe.html");
		
		//locataing
		WebElement dragMe = driver.findElement(By.id("draggable"));
		Actions builder = new Actions(driver);
		//drag and drop method 
		
		builder.dragAndDropBy(dragMe, 300,200);
		builder.perform();
		
		
	}
}
