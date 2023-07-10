package take_screen_shot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenShotExplicitTypeCasting {

	public static void main(String[] args) throws InterruptedException, IOException {
		//by TypeCasting
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		 Thread.sleep(2000);
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 
 //TypeCasting from WebDriver to TakesScreenshot
		    TakesScreenshot ts = (TakesScreenshot) driver ;
		 
  //to store taken screenshot storing in one reference variable
		   File src = ts.getScreenshotAs(OutputType.FILE);
		
 //to see the screen shot we need to crate object of file class n pass path as {path(where to store)/name/extension}
		
	       File destination= new File("./ScreenShots/google.png");
	
// to paste copied screenshot path screen shot  there is 3rd party class i.e Files 
//create object of Files class Files.copy(from where, to where)
	
	        Files.copy(src, destination);
	        
//after running script refresh the project to see screen shot
	
		
		 

	}

}
