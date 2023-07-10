package take_screen_shot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class sc_downcasting {

	public static void main(String[] args) throws InterruptedException, IOException {
	
			//by DownCasting
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			 Thread.sleep(2000);
			 driver.get("https://www.facebook.com/");
			 driver.manage().window().maximize();
			 
			 //DownCasting to RemoteWebDriver class
			 
			 RemoteWebDriver rwd = (RemoteWebDriver)driver;
			 
			  //to store taken screenshot storing in one reference variable
	         File src = rwd.getScreenshotAs(OutputType.FILE);
	         
	         //to see the screen shot we need to crate object of file class n pass path as {path(where to store)/name/extension}
	   File destination= new File("./ScreenShots/facebook.png");
	   
// to paste copied screenshot path screen shot  there is 3rd party class i.e Files 
 //create object of Files class Files.copy(from where, to where)
	   Files.copy(src, destination);
	   
	 //after running script refresh the project to see screen shot
			 

	}

}
