package Mous_Click_keybord;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class contexClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/OnClick_HTML_File/ContextClick.html");
		
		WebElement context = driver.findElement(By.id("div-context"));
		WebElement iteam4 = driver.findElement(By.id("ui-id-4"));
		//create object of action class
		Actions builder = new Actions(driver);
		//perform right click on item 4 
		builder.contextClick(context).click(iteam4);
		builder.perform();
		//handle 
		
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(5000);
		simpleAlert.accept();
		
	}

}
