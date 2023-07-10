package javaScriptExecutor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class puma_assignment {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// puma scroll down
		 WebDriver driver = new ChromeDriver();
			
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://in.puma.com/in/en/mens/mens-shoes?gclid=Cj0KCQjw4s-kBhDqARIsAN-ipH03lrbQ9yXQk5-DEcG7C_25gfKGZY6tWEchSGifqyDwpZDk3c4pq0kaAotDEALw_wcB&utm_aud=OTH&utm_campaign=PS_GGL_IN_PS_GGL_SEA_TXT_Brand_Category_FTW_agency_1000067495857508873&utm_medium=PS&utm_obj=OLC&utm_source=GGL-SEA&offset=24");
		 Thread.sleep(2000);
		 //to handle notification creating robot class
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);	
		
		//searching webelement and storing
		 WebElement bag = driver.findElement(By.xpath("(//img[@title='PUMA x SPONGEBOB Future Rider Unisex Sneakers, Lucent Yellow-PUMA White'])[1]"));
		 
		 //get location of web element
		Point loc = bag.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
	
		 //to perform scroll action (type casting to WebDriver)
		 
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 
		 //to scroll till webelement we r doing concate 
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		 
		 Thread.sleep(2000);
		 
		 

	}

}
