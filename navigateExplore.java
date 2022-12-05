package ActionOnWebE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateExplore {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("paris city");
		
		WebElement search_btn = driver.findElement(By.name("btnk"));
		search_btn.submit();
		
		driver.navigate().to("https://en.wikipedia.org/wiki/Paris");
		Thread.sleep(3000);
		

		driver.navigate().back();
	}

}
