package sikulidemmo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;

public class Sikuliwebautomation {
	
	WebDriver driver;
	Screen s = new Screen();
	
	
	
  @Test
  public void webautomation() throws Exception {
	 driver.get("https://google.com/"); 
	//s.click("C:\\Users\\sivap\\OneDrive\\Pictures\\Screenshots\\windows.png");
	 Thread.sleep(5000);
	 s.click("C:\\Users\\sivap\\OneDrive\\Pictures\\Screenshots\\share.png");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
