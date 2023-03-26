package testngtutorial;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestNgpractice {
	
	WebDriver driver;
	
  @Test
  public void analysis() throws Exception {
	  driver.get("https://www.google.com");
	  Thread.sleep(3000);
	  driver.get("https://www.facebook.com");
	  Thread.sleep(3000);
	  /*driver.findElement(By.name("//*[@id=\"email\"]")).sendKeys("sivaprasad432432@gmail.com");
	  //Thread.sleep(3000);
	  driver.findElement(By.id("id=pass")).sendKeys("@Password@1589@");
	  Thread.sleep(3000);
	  driver.findElement(By.name("name=login")).click();
	  Thread.sleep(3000);*/
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
