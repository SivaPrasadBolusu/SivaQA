package junitpractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Practicetask {
	WebDriver driver;
	
  @Test
  public void Google() throws Exception {
	  driver.get("https:\\www.google.com");
	  Thread.sleep(3000);
	  driver.findElement(By.name("q")).sendKeys("Mylavaram");
	  Thread.sleep(3000);
	  
  }
  
  @Test
  public void googlemaps() throws Exception {
	  driver.get("https:\\www.googlemaps.com");
	  Thread.sleep(3000);
	  driver.findElement(By.name("q")).sendKeys("bolusu siva prasad home");
	  Thread.sleep(5000);
	  driver.findElement(By.name("q")).click();
  }
  
  @Test
  public void redmine() throws Exception {
	  driver.get("https:\\www.redmine.org");
	  Thread.sleep(3000);
	  
  }
  
  @Test
  public void twitter() throws Exception {
	  driver.get("https:\\www.twitter.com");
	  Thread.sleep(2000);
	  
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  //System.setProperty("webdriver.chrome.driver","drivers.Chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
