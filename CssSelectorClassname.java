package Second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CssSelectorClassname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
	
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement currentAddress = driver.findElement(By.cssSelector("textarea[class='form-control']"));
		currentAddress.sendKeys("ratanagiri");
		
		WebElement currentAddress2 = driver.findElement(By.cssSelector("textarea[class='form-control']"));
		currentAddress2.sendKeys("Sangola");
		
		WebElement currentAddress3=driver.findElement(By.cssSelector("textarea[placeholder='current Address']"));
		currentAddress3.sendKeys("Sangli");
		
		//Combine multiple element
		WebElement currentAddress4=driver.findElement(By.cssSelector("textarea#currentAddress=[placeholder='Current Address']"));
		currentAddress4.sendKeys("rajapur");
		
		//Class Attribute and combine web element
		
		WebElement currentAddress5=driver.findElement(By.cssSelector("textarea.from-control[placeholder='Current Address']"));
		currentAddress5.sendKeys("maharahtra");
		
		// Css  selector by dynamic web element
		WebElement currentAddress6=driver.findElement(By.cssSelector("div>textarea[placeholder='Current Address']"));
		currentAddress6.sendKeys("maharahtra");
		
		
	}

}
