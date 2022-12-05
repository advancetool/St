package ActionOnWebE;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertname {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/anil/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/Flight_Reservation/flight_reservation.html");
        WebElement train_link = driver.findElement(By.linkText("Trains"));
        train_link.click();
        
        
        Alert SimpleAlert =driver.switchTo().alert();
        Thread.sleep(5000);
       String alertText1 =  SimpleAlert.getText();
       System.out.println("Simple Alert is "+ alertText1); 
       
       SimpleAlert.accept();
       Thread.sleep(1000);
       
       WebElement confirm_btn = driver.findElement(By.cssSelector("input[value='confirm' Details]")); 
       confirm_btn.click();
       
       Alert promptAlert =  driver.switchTo().alert();
       promptAlert.sendKeys("2");
       Thread.sleep(3000);
       
       WebElement book_btn = driver.findElement(By.cssSelector("input[value='Book']")); 
       book_btn.click();
       
       Alert confirmAlert = driver.switchTo().alert();
       System.out.println("confarm Alert is "+confirmAlert.getText());
       Thread.sleep(3000);
       confirmAlert.dismiss();
       
	}

}
