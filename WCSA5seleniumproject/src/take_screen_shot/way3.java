package take_screen_shot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class way3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		//by creating object of specific browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//creating object of Chrome browser
		 ChromeDriver cDriver = new ChromeDriver();
		 
		 Thread.sleep(2000);
		 cDriver.get("https://www.instagram.com/");
		 cDriver.manage().window().maximize();
		 //directly accessing from chrome browser obj 
		 File src = cDriver.getScreenshotAs(OutputType.FILE);
		 File deestination = new File("./ScreenShots/instagram.jpg");
		 Files.copy(src, deestination);
		//after running script refresh the project to see screen shot
		 
		 
		 

	}

}
