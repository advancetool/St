package ActionOnWebE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingIFrems {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/Flight_Reservation/flight_reservation.html");
		
		// iframe first id= IF1 
		//switching  to frame One Using index
		driver.switchTo().frame(0);
		WebElement frame_heading1 = driver.findElement(By.id("heading1"));
		System.out.println("heading ofFrame one is --------->"+frame_heading1.getText());
		
		// return to defult window (main window)
		driver.switchTo().defaultContent();
		
		//cheack main windoew or not 
		System.out.println("Title of main window ------->"+driver.getTitle());
		
		System.out.println("Switch to main title..");
		System.out.println("*** second Frame ****");
		
		//Swatickhing to frame2 usong name or id 
		driver.switchTo().frame("IF2");
		System.out.println("This is frame 2 is --->"+driver.getTitle());
		Thread.sleep(3000);
		
		WebElement frame2 =driver.findElement(By.id("heading2"));
        System.out.println("Heading of Frame2 --->"+frame2.getText());	
        
        //switching Child Iframe inside to frame to 
        
        driver.switchTo().frame(0);
        System.out.println("Switch to Child frame to insside..");
        
        WebElement childframe=driver.findElement(By.id("heading3"));
        System.out.println("Heading of child node is inside ---->"+childframe.getText());
        
        
        //switch main Window 
        
        driver.switchTo().defaultContent();
        System.out.println("Switch to main Window ...");
	}

}
