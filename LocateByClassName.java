package Anil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocateByClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		List <WebElement>textboxes=driver.findElements(By.className("inputtext"));
		
		System.out.print(textboxes.size());
		for(int i=0;i<textboxes.size();i++)
		{			
			System.out.println(textboxes.get(i).getAttribute("name"));
			
		}
		
	textboxes.get(0).sendKeys("abc@gmail.com");
	}

}
