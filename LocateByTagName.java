package praticalno1;

import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/home/anil/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		@SuppressWarnings("unchecked")
		List <WebElement> list=(List<WebElement>) driver.findElement(By.tagName("input"));//locate multiple element
		for(int i=0;i<list.size();i++)  //iterate throw list
		{
			System.out.println(list.get(i).getAttribute("name"));//print name Attribute
		
		     list.get(1).sendKeys("abc@gmail.com");
		
		}
	
	}

}
