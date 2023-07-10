package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toScroll {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
			
		 driver.manage().window().maximize();
		 driver.get("https://www.selenium.dev/documentation/webdriver/elements/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //to perform scroll action (type casting to WebDriver)
		 
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 
		 //to scroll down
		 jse.executeScript("window.scrollBy(0,500)");
		 //to scroll up
		 Thread.sleep(2000);
		 
		 jse.executeScript("window.scrollBy(0,-500)");
		 //same for scroll left and right
		 //jas.executeScript("window.scrollBy(500,0)")  = for right scroll
		 //jas.executeScript("window.scrollBy(-500,0)")  = for left scroll
		 

	}

}
