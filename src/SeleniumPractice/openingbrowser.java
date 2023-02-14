package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openingbrowser {
	static WebDriver driver;
	public static void main(String[] args) {
	
		
		
		System.setProperty("webdriver.chrome.driver","drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.Google.com");
		driver.get("https://www.Twitter.com");
		driver.get("https://www.facebook.com");
		driver.quit();
		
		

	}

}
