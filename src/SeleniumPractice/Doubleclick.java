package SeleniumPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Doubleclick {
	WebDriver driver;
	
	
  @Test
  public void doubleclickfunctionality() throws Exception {
	  driver.get("http://www.seleniumlearn.com/double-click");
	  Thread.sleep(5000);
	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"node-104\"]/div/div[1]/div/div/button"))).doubleClick().perform();
	
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  
	  
  }

}
