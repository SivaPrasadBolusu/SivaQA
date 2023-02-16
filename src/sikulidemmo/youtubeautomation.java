package sikulidemmo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterClass;

public class youtubeautomation {
	
	WebDriver driver;
	Screen S = new Screen();
	
  @Test
  public void youtubeAutomation() throws Exception {
  
  driver.get("https://www.youtube.com/watch?v=VbP63hqO0sk");
  Thread.sleep(3000);
   S.click("C:\\Users\\sivap\\OneDrive\\Pictures\\Screenshots\\play.png");
   Thread.sleep(5000);
 
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "drivers\\ChromeDriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  
  }

}
