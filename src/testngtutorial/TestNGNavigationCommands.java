package testngtutorial;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class TestNGNavigationCommands {
	WebDriver driver;
 
	@Test//(enabled=false)
	public void Refresh(){
	    driver.get("http://www.techlearn.in");    
	    driver.navigate().refresh(); 
	}

	@Test//(enabled=false)
	public void Get(){
	    driver.get("http://www.techlearn.in");
	    driver.get(driver.getCurrentUrl()); 
	}

	@Test
	public void sendKeys(){
	    driver.get("http://www.techlearn.in");
	    driver.findElement(By.linkText("TechLearn.in")).sendKeys(Keys.F5);
	}

	@Test//(enabled=false)
	public void NavigateTo(){
	    driver.get("http://www.techlearn.in");   
	    driver.navigate().to(driver.getCurrentUrl());
	}
	 
	@Test
	public void sendKeysmethod(){
	    driver.get("http://www.techlearn.in"); 
	    driver.findElement(By.linkText("TechLearn.in")).sendKeys("\uE035");
	    }

	@Test//(enabled=false)
	  public void NavigateSameURL() throws Exception {
	  driver.get("http://www.techlearn.in");  
	  Thread.sleep(3000);
	  for(int i = 0;i<=1;i++)
	  {
	  driver.navigate().to(driver.getCurrentUrl());
	  Thread.sleep(2000);
	  }
	    }
	@BeforeTest
	  public void beforeTest() {
	      driver=new ChromeDriver();
	      driver.manage().window().maximize();
	  }

	  @AfterTest
	  public void afterTest() {
	  }
	}
	
	
	
	
