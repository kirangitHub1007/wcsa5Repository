package take_screen_shot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class way5 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// by creating object of eventFiringWebDriver class
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		 Thread.sleep(2000);
		 driver.get("https://www.amazon.com/");
		 driver.manage().window().maximize();
		 
//create object of eventFiringWebDriver class n providing reference of WebDriver as n argument
		EventFiringWebDriver ewd = new  EventFiringWebDriver(driver);

		File src = ewd.getScreenshotAs(OutputType.FILE);
		
  File dest = new	File("./ScreenShots/amazon.jpg");
  Files.copy(src, dest);
  
		
	}

}
