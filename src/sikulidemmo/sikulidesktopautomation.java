package sikulidemmo;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class sikulidesktopautomation {
	Screen s = new Screen();
	
  @Test
  public void desktop() throws FindFailed, Exception {
	  	s.click("C:\\Users\\sivap\\OneDrive\\Pictures\\Screenshots\\battery.png");
	  	//Thread.sleep(2000);
	  	s.click("C:\\Users\\sivap\\OneDrive\\Pictures\\Screenshots\\windows.png");
	  	//s.click("C:\\Users\\sivap\\OneDrive\\Pictures\\Screenshots\\filemanager.png");
	  	s.click("C:\\Users\\sivap\\OneDrive\\Pictures\\Screenshots\\speakers.png");
	  	s.click("C:\\Users\\sivap\\OneDrive\\Pictures\\Screenshots\\wifi.png");
  }
}

