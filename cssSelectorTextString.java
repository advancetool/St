package praticalno1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorTextString {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/home/anil/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
			
			driver.get("https://demoqa.com/automation-practice-form");
			
			WebElement firstname = driver.findElement(By.cssSelector("input[id^='fir']"));
	        firstname.sendKeys("Anil");
	        
	        WebElement middleName = driver.findElement(By.cssSelector("input[id$='fir']"));
	        middleName.sendKeys("Nanaso");
	        
	        //
	        WebElement firstname2 = driver.findElement(By.cssSelector("input[id*=erNa']"));
	        firstname2.sendKeys("Rode");
	        
	        
	        
		}
  }

