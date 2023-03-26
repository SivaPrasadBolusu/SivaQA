package SeleniumPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LocatorClassNamePracticeonFB {
	
	WebDriver driver;
	
  @Test
  public void locatorsclassName() throws Exception {
	  driver.get("https://www.facebook.com/login/");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"email_container\"]/input")).sendKeys("9398142136");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Hello@123");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
	
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "drivers//ChromeDriver.exe");
	 driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
