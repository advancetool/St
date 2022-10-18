package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class HandlingDroupBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://output.jsbin.com/osebed/2");
		
		Select fruits=new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");// selsect by visible method 
	   // System.out.println(fruits.getFirstSelectedOption().getText());
	
        fruits.selectByValue("orange");//select by value
	    fruits.selectByIndex(3);//select by index
	
	       Thread.sleep(5000);
//	       fruits.deselectByIndex(0);
//	       fruits.deselectByVisibleText("Banana");
//	       fruits.selectByValue("grape");
	       
	       List<WebElement>selected_items = fruits.getAllSelectedOptions();//All Display items
	       
	      for(int i=0;i<selected_items.size();i++) 
	      {
	    	  System.out.println(selected_items.get(i).getText());
	      }
	       
	       System.out.println(fruits.isMultiple());
	}
	

}
