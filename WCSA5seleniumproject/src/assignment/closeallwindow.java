package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeallwindow {

	public static void main(String[] args) {
		// to close all the browsers
	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://omayo.blogspot.com/");
		 driver.findElement(By.linkText("Open a popup window")).click();
		 driver.quit();
		 
			
		 
		 
		 

	}

}
