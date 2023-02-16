package sikulidemmo;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

public class Practiceprog {
	
	Screen S = new Screen();
	
  @Test
  public void f() throws SikuliException, Exception {
	  S.type("C:\\Users\\sivap\\OneDrive\\Pictures\\Screenshots\\search.png","apps");
	  Thread.sleep(3000);
	 S.click("C:\\Users\\sivap\\OneDrive\\Pictures\\Screenshots\\windows.png");
	  //S.click("C:\\Users\\sivap\\OneDrive\\Pictures\\Screenshots\\wifi.png");
	  S.click("C:\\Users\\sivap\\OneDrive\\Pictures\\Screenshots\\upwardarrow.png");
	  //Thread.sleep(3000);
	 S.dragDrop("C:\\Users\\sivap\\OneDrive\\Desktop\\Credientials.txt","C:\\Users\\sivap\\OneDrive\\Desktop\\New folder");
	  
  }
}
