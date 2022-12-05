package praticalno1;



//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/home/anil/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		//Radio Button 2
		WebElement option1=driver.findElement(By.id("vfb-7-1"));
		option1.click();
		
		// radio button2
		WebElement option2=driver.findElement(By.id("vfb-7-1"));
		option2.click();
		
		//radio Button
		WebElement option3=driver.findElement(By.id("vfb-7-1"));
		option3.click();
		
	//Cheack boxes 1
	WebElement checkbox1=driver.findElement(By.id("vfb-6-0"));
	checkbox1.click();
	
	//Check box2
	WebElement checkbox2=driver.findElement (By.id("vfb-6-0"));
	checkbox2.click();
	//check box 3
	WebElement checkbox3=driver.findElement (By.id("vfb-6-0"));
	checkbox3.click();
	  }
}