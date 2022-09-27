package Anil;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;

public class LocatingByPartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.guru99.com/test/network");
		WebElement car_rental_link=driver.findElement(By.partialLinkText("Car"));
        car_rental_link.click();
	}

}
