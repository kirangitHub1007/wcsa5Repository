package popUP_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class desktopPopup {

	public static void main(String[] args) {
		// handle file upload pop up of Omayo website
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://omayo.blogspot.com/");
		 
		 Actions action = new Actions(driver);
		 
		WebElement upload = driver.findElement(By.id("uploadfile"));
		

	}

}
