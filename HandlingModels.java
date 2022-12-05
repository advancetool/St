package ActionOnWebE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingModels {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/Flight_Reservation/hotel_search.html");
		
		WebElement hotels = driver.findElement(By.cssSelector("button[data-target='#myModal']"));
		hotels.click();
		Thread.sleep(3000);
		
		WebElement model_header1= driver.findElement(By.xpath("//h4[@class='modal-title']"));
	    System.out.println("model header is ="+model_header1.getText());
		
        WebElement okElement= driver.findElement(By.xpath("//button[text()='Ok']"));
	    okElement.click();
	    Thread.sleep(3000);

	    WebElement book_button= driver.findElement(By.xpath("myBtn1"));
	    book_button.click();
	   
	    WebElement htlname= driver.findElement(By.xpath("htlname"));
	    htlname.sendKeys("Mango Vila");
	    Thread.sleep(3000);
	    
	    WebElement cancal= driver.findElement(By.xpath("//button[@type='submit']//following::button"));
	    cancal.click();
	   
	  

	}

}
