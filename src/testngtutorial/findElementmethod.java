package testngtutorial;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class findElementmethod {
  
	 WebDriver driver;
	
	@Test
  public void findElement() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("techlearn.in" + Keys.ENTER);

  }
 
	@Test
  public void findElementsMethod() {
		
		driver.get("http://www.techlearn.in");
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Links on Techleran.in Website : " + totalLinks.size());

  }
  
	
	@BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "PathToGeckoDriver\\geckodriver.exe"); 
		driver = new FirefoxDriver();

		
		/*ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote_allow-origins=*");
		driver = new ChromeDriver(co);*/
		
		driver.manage().window().maximize();
  }

  
	
	@AfterTest
  public void afterTest() {
		driver.close();
		
  }

}
