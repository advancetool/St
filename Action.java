package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		//driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement userid  =driver.findElement(By.xpath("//input[@name='uid']"));
		System.out.println(userid.getCssValue("background-color"));
		System.out.println(userid.getCssValue("border-color"));
		System.out.println(userid.getCssValue("FONT-FAMILY"));
		//print tag name userid element
		System.out.println(userid.getTagName());
		
//display Method boolean value return
		System.out.println(userid.isDisplayed());
		
		//Enable method boolean Value return
		System.out.println(userid.isEnabled());
	}

}
