package testngtutorial;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestNGAlphabeticalorder {
	WebDriver driver;
	
  @Test
  public void twitter() throws Exception {
	  driver.get("https:\\www.twitter.com");
	  Thread.sleep(4000);
  }
  
  @Test
  public void facebook() throws Exception {
	  driver.get("https:\\www.facebook.com");
	  Thread.sleep(4000);
  }
  
  @Test
  public void google() throws Exception {
	  driver.get("https:\\www.google.com");
	  Thread.sleep(4000);
  }
  
  @Test
  public void whatsapp() throws Exception {
	  driver.get("https:\\www.whatsapp.com");
	  Thread.sleep(4000);
  }
  
  @Test
  public void redmine() throws Exception {
	  driver.get("https:\\www.redmine.org");
	  Thread.sleep(4000);
  }
  
  @Test
  public void flipkart() throws Exception {
	  driver.get("https:\\www.flipkart.com");
	  Thread.sleep(4000);
  }
  
  @Test
  public void amazon() throws Exception {
	  driver.get("https:\\www.amazon.com");
	  Thread.sleep(4000);
  }
  
  @Test
  public void meesho() throws Exception {
	  driver.get("https:\\www.meesho.com");
	  Thread.sleep(4000);
  }
  
  
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","drivers\\ChromeDriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
