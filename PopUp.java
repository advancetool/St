package ActionOnWebE;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/Flight_Reservation/flight_reservation.html");
		
		String mainWindow = driver.getWindowHandle();//   rterive unique id 
	    System.out.println("Main window handle = "+mainWindow);
	    System.out.println("title of main window is="+ driver.getTitle());
		
	    //handle thre windows 
		WebElement Hotels= driver.findElement(By.linkText("Hotels"));
		Hotels.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for (String windowHandle : handles) {
			if (!windowHandle.equals(mainWindow)) {
				driver.switchTo().window(windowHandle);
				System.out.println("title of child window = " + driver.getTitle());
				WebElement headling1= driver.findElement(By.id("sampleHeading"));
				System.out.println("healding inside clild window is ="+headling1.getSize());
				  Thread.sleep(3000);
				driver.close();
				
			}		
			
		}
		driver.switchTo().window(mainWindow);
		System.out.println("Title of main windows ="+driver.getTitle());
				
		
		
		
	

	}

}
