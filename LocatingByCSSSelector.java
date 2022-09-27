package Anil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingByCSSSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-from");
		
		WebElement firstname=driver.findElement(By.cssSelector("input[id=firstname]"));
        firstname.sendKeys("Anil");
        		
        WebElement lastname=driver.findElement(By.cssSelector("input[id=lastname]"));
        lastname.sendKeys("Rode");
	}

	
}
