package take_screen_shot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class way4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		//by creating object for remote web driver
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		RemoteWebDriver rdriver= new ChromeDriver();
		 Thread.sleep(2000);
		 rdriver.get("https://www.flipkart.com/");
		 rdriver.manage().window().maximize();
		 File src = rdriver.getScreenshotAs(OutputType.FILE);
		 
	
		 File deestination = new File("./ScreenShots/flipkart.jpg");
		 Files.copy(src, deestination);
		 
		 
		 
		 
		 
		 

	}

}
