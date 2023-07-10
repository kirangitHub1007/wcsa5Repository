package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign_seleniumscroll {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.selenium.dev/");
		 WebElement news = driver.findElement(By.xpath("//h2[text()='News']"));
		 news.getLocation();
		 
		 
		 //to perform scroll action (type casting to WebDriver)
		 
		// JavascriptExecutor jse = (JavascriptExecutor)driver;


	}

}
