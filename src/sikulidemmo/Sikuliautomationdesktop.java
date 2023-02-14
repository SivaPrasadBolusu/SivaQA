package sikulidemmo;

import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class Sikuliautomationdesktop {
	
 static Screen s = new Screen();

	public static void main(String[] args) throws SikuliException, Exception {
		
			//s.click("C:\\Users\\sivap\\OneDrive\\Pictures\\Screenshots\\windows.png");
			Thread.sleep(2000);
			//s.click("C:\\Users\\sivap\\OneDrive\\Pictures\\Screenshots\\Battery1.png");
			Thread.sleep(2000);
			//s.click("C:\\Users\\sivap\\OneDrive\\Pictures\\Screenshots\\upwardarrow.png");
			Thread.sleep(2000);
			s.dragDrop("C:\\Users\\sivap\\OneDrive\\Pictures\\Screenshots\\credientials.png","C:\\Users\\sivap\\OneDrive\\Pictures\\Screenshots\\newfolder.png");
			s.click("C:\\Users\\sivap\\OneDrive\\Pictures\\Screenshots\\filemanager.png");
			s.type("C:\\Users\\sivap\\OneDrive\\Pictures\\Screenshots\\search.png","notepad");
			//s.click("C:\\Users\\sivap\\OneDrive\\Pictures\\Screenshots\\speakers.png");
			s.click("\"C:\\Users\\sivap\\OneDrive\\Pictures\\Screenshots\\wifi.png");
	
		}
		
		
	}
