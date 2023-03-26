package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorID {
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		
		//System.setProperty("webdriver.chrome.driver", "drivers//ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.seleniumlearn.com/java");
		Thread.sleep(3000);
		  driver.findElement(By.id("edit-search-block-form--2")).sendKeys("selenium");
	      driver.findElement(By.id("edit-submit")).sendKeys(Keys.ENTER);
	      Thread.sleep(3000);
	      
	      driver.quit();
	      
		

	}

}
