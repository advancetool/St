package pratical2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
	//Xpath=//tagname[@Attribute='value']
	//start root node in single
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
			
			driver.get("https://demo.guru99.com/test/selenium-xpath.html");
	}

}
