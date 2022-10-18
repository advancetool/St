package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingByXpth{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		WebElement testing =driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/h4[2]/b"));
		WebElement testing1 =driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/h4[1]/b"));
		WebElement testing2 =driver.findElement(By.xpath("//div[@class='row featured-boxes']//div[2]//h4[1]//b[1]"));
		
		WebElement userId  =driver.findElement(By.xpath("//input[@name='uid']"));
		WebElement password  =driver.findElement(By.xpath("//input[@type='text']"));
		
	 System.out.println(testing.getText());  //absulte Xpath
	 System.out.println(testing1.getText());
	 System.out.println(testing2.getText());
	 
	 System.out.println(userId.getText());   //relative xpath
	 System.out.println(password.getText());
	 
	 WebElement login =driver.findElement(By.xpath("//*[contains(@name,'btn')]"));
	 System.out.println(login.getAttribute("name"));
	
	 WebElement Reset =driver.findElement(By.xpath("//*[contains(@id,'message')]"));
	 System.out.println(Reset.getAttribute("message"));
	
	 
	
	
	}

}
