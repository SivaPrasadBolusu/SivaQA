package junitpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Junitdemo {

	 static	WebDriver driver;
	 	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	
	System.setProperty("webdriver.chrome.driver","C:\\LIB\\ChromeDriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\LIB\\ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	} 
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	driver.quit();
	}
	@Test
	void test1() {
		driver.get("https://www.google.com");
	}
	
	@Test
	void test2() {
		driver.get("https://www.twitter.com");
	}
	
	@Test
	void test3() {
		driver.get("https://www.whatsapp.com");
	}
	
	@Test
	void test4() {
		driver.get("https://www.redmine.org.");
	}

}
