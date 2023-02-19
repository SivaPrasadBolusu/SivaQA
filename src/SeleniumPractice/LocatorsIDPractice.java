package SeleniumPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LocatorsIDPractice {
	
	WebDriver driver;
  @Test
  public void locatorid() throws Exception {
	  driver.get("http://www.seleniumlearn.com/java");
		Thread.sleep(3000);
		  driver.findElement(By.id("edit-search-block-form--2")).sendKeys("selenium");
	      driver.findElement(By.id("edit-submit")).sendKeys(Keys.ENTER);
	      Thread.sleep(3000);
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "drivers//ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
