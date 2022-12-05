package Mous_Click_keybord;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldatCurrentPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/OnClick_HTML_File/Sortable.html");
		//get location title 3 and move the cursor to type three
		WebElement three =driver.findElement(By.name("three"));
		
		System.out.println("X -cordinate -->"+three.getLocation().x + "  Y-cordinate -->"+three.getLocation().y);

		Actions builder= new Actions(driver);
    builder.moveByOffset(three.getLocation().x=1,three.getLocation().y+1);
    builder.clickAndHold();
    
    //locate 
    WebElement two =driver.findElement(By.name("two"));
    
    System.out.println("x cordinaate of title2 ="+two.getLocation().x);
    System.out.println("y cordinaate of title1 ="+two.getLocation().y);
    
    builder.moveByOffset(120,0);
    builder.perform();
	}

}
