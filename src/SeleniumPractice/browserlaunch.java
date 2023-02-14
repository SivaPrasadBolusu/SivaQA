package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserlaunch {
		static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\LIB\\ChromeDriver.exe");
		
		driver = new ChromeDriver();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		//driver.close();
		driver.quit();
		
		

	}

}
