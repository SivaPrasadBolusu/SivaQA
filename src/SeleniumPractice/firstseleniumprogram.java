package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstseleniumprogram {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     WebDriver driver;
     System.setProperty("webdriver.chrome.driver","C:\\LIB\\chromedriver.exe");
     driver = new ChromeDriver();
     Thread.sleep(3000);
     driver.manage().window().maximize();
     Thread.sleep(3000);
      driver.close();
     
 
	}

}
