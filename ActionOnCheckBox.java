package XPath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActionOnCheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		//driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");

		driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
		
		WebElement bike  = driver.findElement(By.cssSelector("input[Value='Bike']"));
		WebElement car  = driver.findElement(By.cssSelector("input[Value='Car']"));
		WebElement boat  = driver.findElement(By.cssSelector("input[Value='Boat']"));
		
		WebElement lastname = driver.findElement(By.name("lname"));
		 
		
		
		bike.click();
		car.click();
		System.out.println(bike.isSelected());
		System.out.println(car.isSelected());
		System.out.println(boat.isSelected());
		
		if(lastname.isEnabled())
			System.out.println("last name is enable");
		else
			System.out.println("last name is not enable");
		
		Select car_type= new Select(driver.findElement(By.tagName("select")));
		car_type.selectByValue("USA");
		car_type.selectByIndex(2);
		
		if(car_type.isMultiple())
		{
			 List<WebElement>selected_items = car_type.getAllSelectedOptions();
			 for(int i=0;i< selected_items.size();i++)
			 {
				 System.out.println("multiple Action not allow");
			 }
			
		
		}
		
	}
	

}
