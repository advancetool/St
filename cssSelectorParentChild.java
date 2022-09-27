package Second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class cssSelectorParentChild {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//find element findelement
				//parentCSS locator>Child HTML tag :nth-of-type(index)
				//parent tag is select  id 
	
		driver.get("https://demoqa.com/select-menu");
		
		WebElement currentAddress = driver.findElement(By.cssSelector("select#oldSelectMenu>option:nth-of-type(2)"));
        currentAddress.click();
	}

}
