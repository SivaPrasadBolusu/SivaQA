package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserslaunchpracticeprogram {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.ChromeDriver.driver","C:\\LIB\\cgromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
			driver.get("https://www.Google.com");
			driver.get("https://www.selenium.dev");
			driver.get("https://www.flipkart.com");
			driver.get("https://www.amazon.com");
		
			driver.close();
			
	}

}
