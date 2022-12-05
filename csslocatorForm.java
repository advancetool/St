package pratical2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class csslocatorForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
			
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement car_rental_link=driver.findElement(By.partialLinkText("Car"));
        car_rental_link.click();
	        
	       
		
	}

}
