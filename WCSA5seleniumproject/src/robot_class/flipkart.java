package robot_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		 Thread.sleep(2000);
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button[text()='✕']")).click();
		 
		 //generate print pop up
		 
		 Robot robot = new Robot();
		 
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_P);
		 
		 Thread.sleep(2000);
		 
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_P);
		 
		 // shift control to cancel button
		 
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyRelease(KeyEvent.VK_TAB);
		 
		 
		 Thread.sleep(2000);
		 
		 //to hit  enter button
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 
		 
		 
		 

	}

}
