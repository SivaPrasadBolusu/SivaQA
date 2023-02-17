package testngtutorial;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestNgPriority {
	WebDriver driver;
	
  @Test
  public void google() throws Exception {
	  driver.get("https://www.google.com");
	  Thread.sleep(3000);
	  
  }
  
  @Test(priority=4)
  public void facebook() throws Exception {
	  driver.get("https://www.facebook.com");
	  Thread.sleep(3000);
  }
  
  @Test(priority=3)
  public void Redmine() throws Exception {
	  driver.get("https://www.redmine.org");
	  Thread.sleep(3000);
  }
  
  @Test (priority=0)
  public void whatsap() throws Exception {
	  driver.get("https://www.whatsapp.com");
	  Thread.sleep(3000);
	  
  }
  
 @Test (priority = 1)
  public void Selenium() throws Exception {
	  driver.get("https://www.selenium.dev");
	  Thread.sleep(3000);
  }
  
  @Test
  public void meesho() throws Exception {
	  driver.get("https://www.meesho.com");
	  Thread.sleep(3000);
  }
  
  @Test
  public void flipkart() throws Exception {
	  driver.get("https://www.flipkart.com");
	  Thread.sleep(3000);
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","drivers//ChromeDriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

}
