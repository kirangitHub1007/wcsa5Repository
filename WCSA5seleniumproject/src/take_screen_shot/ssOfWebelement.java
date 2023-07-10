package take_screen_shot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ssOfWebelement {

	public static void main(String[] args) throws InterruptedException {
		// taking screenshot of web element by using takeScreenShotAs method
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		 Thread.sleep(2000);
		 driver.get("file:///C:/Users/ASUS/Desktop/Selenium%20DATA/drop_down.html");
		 driver.manage().window().maximize();
		
		 
		

	}

}
