package log4jtutorial;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jpractice {
	static WebDriver driver;

	public static void main(String[] args) {
		 Logger log= Logger.getLogger("googlesearch");
		  PropertyConfigurator.configure("Log4j.properties"); 
	  
		  //System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  log.info("Launch the Chrome Browser");
		  
		  driver.manage().window().maximize();
		  log.info("Browser window Maximize");
		  driver.get("https://www.google.com");
		  log.info("open google");
		  driver.findElement(By.name("q")).sendKeys("Amaravathi");
		  log.info("enter Amaravathi in google search"); 
		  
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		  log.info("press enter button in keyboard");

		
		

	}

}
