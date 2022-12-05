package Mous_Click_keybord;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffsetAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/OnClick_HTML_File/Selectable.html");
		
		WebElement three =driver.findElement(By.name("three"));
		three.getLocation();
		System.out.println("X -cordinate -->"+three.getLocation().x + "  Y-cordinate -->"+three.getLocation().y);

		Actions builder = new Actions(driver);
	    builder.moveByOffset(three.getLocation().x+1, three.getLocation().y+1).click();
	    builder.perform();//exuction Action 
	}

}
