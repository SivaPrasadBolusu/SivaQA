package SeleniumPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Sendtexttoalertwindow {
	
	WebDriver driver;
	
  @Test
  public void Sendtexttoalertpopup() throws Exception {
	  driver.get("http://www.seleniumlearn.com/prompt-dialog-box");
	  Thread.sleep(3000);
	 /* driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
	  Alert alert= driver.switchTo().alert();
	  alert.sendKeys("WELCOME TO SHIVA's World");
	  Thread.sleep(5000);
	  alert.accept();*/
	  
	  driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
	  Alert alert = driver.switchTo().alert();
	  Thread.sleep(3000);
	  alert.sendKeys("HI SHIVA WELCOME TO SELENIUMLEARN.COM");
	  Thread.sleep(3000);
	  alert.accept();  
  }
  
  @BeforeClass
  public void beforeClass() throws Exception {
	  
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
	  
  }

  @AfterClass
  public void afterClass() {
	//  driver.close();

	  
	  
  }

}
