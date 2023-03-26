package SeleniumPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class RightClickFunctionality {
	WebDriver driver;
	
	
  @Test
  public void righhtclick() throws Exception {
	  driver.get("http://www.seleniumlearn.com/");
      Thread.sleep(5000); 
      Actions act=new Actions(driver);
      act.contextClick(driver.findElement(By.linkText("Testing"))).perform();
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
