package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeParentWindow {

	public static void main(String[] args) throws InterruptedException {
		// to close parent window

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("http://omayo.blogspot.com/");
		 driver.findElement(By.linkText("Open a popup window")).click();
		  Thread.sleep(2000);
		// to close parent window
		  driver.close();
		  

	}

}
