package Mous_Click_keybord;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyinstraction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement Password = driver.findElement(By.id("passwd"));
		
		Actions builder = new Actions(driver);		
		builder.keyDown(email, Keys.SHIFT).sendKeys("Anil");
		builder.keyUp(email, Keys.SHIFT);
		builder.keyDown(Password, Keys.SHIFT).sendKeys("Password ").perform();
}
}
