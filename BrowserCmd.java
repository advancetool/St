package ActionOnWebE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCmd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/anil/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		//get title of the URL
		String page_title=driver.getTitle();
		System.out.println("page Title is --> "+page_title);
		Thread.sleep(3000);
		
		// page get current Url 
		driver.navigate().to("https://old.mu.ac.in/distance-open-learning/idol-results/");
		String current_url=driver.getCurrentUrl();
		System.out.println("current Url is -->"+current_url);
		System.out.println("page Title is -->"+driver.getTitle());
		
		//get page Source
		String page_source =driver.getPageSource();
		System.out.println("page source is -->"+page_source);
		
		//close multiple window 
		//driver.close();
		
		//quit method 
		driver.quit();
		
		
		

	}

}
