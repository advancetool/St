package praticalno1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LocatingByPartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/anil/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.guru99.com/test/network");
		WebElement car_rental_link=driver.findElement(By.partialLinkText("Car"));
        car_rental_link.click();
	}

}