package SeleniumPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LocatorName {
		
	WebDriver driver;
	
  @Test
  public void name() throws Exception {
	  
	  driver.get("http://www.seleniumlearn.com/user");
	  Thread.sleep(3000);
	  driver.findElement(By.name("name")).sendKeys("Siva");
	  Thread.sleep(3000);
	  driver.findElement(By.id("edit-pass")).sendKeys("Prasad");
	  Thread.sleep(3000);
	  driver.findElement(By.id("edit-submit")).click();
      
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("Webdriver.chrome.driver", "drivers//ChromeDriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
