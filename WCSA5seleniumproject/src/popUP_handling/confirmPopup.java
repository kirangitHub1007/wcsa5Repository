package popUP_handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmPopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TO handle confirm popup
		
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
				 WebDriver driver = new ChromeDriver();
			
				 driver.manage().window().maximize();
				
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

				 driver.get("file:///C:/Users/ASUS/Desktop/Selenium%20DATA/confirm_popup.html");
				 
				 driver.findElement(By.xpath("//input[@type='submit']")).click();
				 Thread.sleep(2000);
//				 Alert al = driver.switchTo().alert();
//				// al.accept();
//				 System.out.println(al.getText());
//				 al.dismiss();
				 
				 //handle alert pop up by using robot class
				Robot robot = new Robot();
				 
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				 

	}

}
