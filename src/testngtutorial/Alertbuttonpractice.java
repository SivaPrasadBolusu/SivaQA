package testngtutorial;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Alertbuttonpractice {
	WebDriver driver;
	
  @Test
  public void alertbuttontesting() throws Exception {
	  
		     driver.get("http://www.seleniumlearn.com/confirmation-dialog-box");
		     Thread.sleep(10000);
		     driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
		     Thread.sleep(10000);
		     driver.switchTo().alert().accept();//    accept means :click on "OK" option button
		     //driver.switchTo().alert().dismiss();  // dismiss means : click on "Cancel" option button
		     }


  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
