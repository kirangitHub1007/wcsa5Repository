package popUP_handling;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class ass1 {
  static WebDriver driver;
	public static void main(String[] args) {
		// handle notification popup with multiple browser
		// create obj of scanner class
		Scanner sc = new Scanner(System.in);
	System.out.println("enter browser value");
	
 String  browserValue = sc.next();
 if(browserValue.equalsIgnoreCase("Chrome"))
 {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
	 ChromeOptions oc = new ChromeOptions();
	 oc.addArguments("--disable-notification");
	 driver= new ChromeDriver(oc);
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.easemytrip.com/flights.html");
 }
 else if(browserValue.equalsIgnoreCase("Edge"))
 {
	 System.setProperty("webdriver.edge.driver","./drivers/edgedriver.exe" );
	 
	EdgeOptions oc = new  EdgeOptions();
	  oc.addArguments("--disable-notification");
	 driver= new EdgeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.easemytrip.com/flights.html");

 }
 else {
	 System.out.println("enter valid input");
 }
	 
	
		
		

	}

}
