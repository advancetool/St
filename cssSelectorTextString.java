package Second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorTextString {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
			
			driver.get("https://demoqa.com/automation-practice-form");
			
			WebElement firstname = driver.findElement(By.cssSelector("input[id^='fir']"));
	        firstname.sendKeys("Vitthal");
	        
	        WebElement firstname1 = driver.findElement(By.cssSelector("input[id$='fir']"));
	        firstname1.sendKeys("Rawool");
	        
	        //
	        WebElement firstname2 = driver.findElement(By.cssSelector("input[id*=erNa']"));
	        firstname2.sendKeys("Rawool");
	        
	        
	        
		}
  }


