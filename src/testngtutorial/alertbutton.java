package testngtutorial;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class alertbutton {
	WebDriver driver;
	
@Test
  //public void alertokbutton() throws Exception {
	 public void AlertokButton()throws Exception {
	     driver.get("http://www.seleniumlearn.com/confirmation-dialog-box");
	     driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
	     driver.findElement(By.xpath("//*[@id='node-102']/div/div[1]/div/div/button")).click();
	     Thread.sleep(5000);
	     //driver.switchTo().alert().accept();//    accept means :click on "OK" option button
	     driver.switchTo().alert().dismiss();  // dismiss means : click on "Cancel" option button
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
