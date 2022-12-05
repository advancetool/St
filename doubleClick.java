package Mous_Click_keybord;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/OnClick_HTML_File/DoubleClick.html");
		
		///locate element 
		WebElement clickMe = driver.findElement(By.name("dblClick"));
		Actions builder = new Actions(driver);
		builder.moveToElement(clickMe).doubleClick();
		builder.perform();
		
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		Thread.sleep(5000);
		builder.doubleClick(clickMe).perform();
	
		
	}

}
