package popUP_handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// handle alert pop up by robot class
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		 WebDriver driver = new ChromeDriver();
	
		 driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		 driver.get("file:///C:/Users/ASUS/Desktop/Selenium%20DATA/alertPopUp.html");
		 
		 driver.findElement(By.xpath("//button[text()='alert_popup']")).click();
		 //handle alert pop up by using robot class
//		 Robot robot = new Robot();
//		 
//		 robot.keyPress(KeyEvent.VK_ENTER);
//		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 //handle alert pop up by switch to method
		 Alert al = driver.switchTo().alert();
		 //Thread.sleep(2000);
		//  al.accept();  {to accept alert pop up}
		// al.dismiss();   {to dismiss pop up}
		System.out.println(al.getText());
	}

}
