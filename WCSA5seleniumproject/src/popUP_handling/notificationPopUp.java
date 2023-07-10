package popUP_handling;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificationPopUp {

	public static void main(String[] args) {
		// handle notification popup in easymytrip website
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		
		//to handle notification create object of options class
		ChromeOptions oc = new ChromeOptions();
		
		//use method of options class
		oc.addArguments("--disable-notifications");
		
		//pass obj ref var to chromeDriver as an argument
		 WebDriver driver = new ChromeDriver(oc);
		 
	
		 driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		 driver.get("https://www.easemytrip.com/flights.html");

	}

}
