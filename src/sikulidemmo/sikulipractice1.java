package sikulidemmo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class sikulipractice1 {
	static Screen s = new Screen();
	static WebDriver driver;
	

	public static void main(String[] args) throws SikuliException, Exception {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.google.com");
		//s.click("C:\\Users\\sivap\\OneDrive\\Pictures\\Screenshots\\hamberged.png");
		s.click("C:\\Users\\sivap\\OneDrive\\Pictures\\Screenshots\\Webstore.png");
		Thread.sleep(3000);
		driver.quit();
		

	}

}
