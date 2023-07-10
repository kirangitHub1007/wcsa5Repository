package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assOnActionRobotclss {

	public static void main(String[] args) throws InterruptedException, AWTException {
	// assignment on robot n action class
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=Cj0KCQjwnMWkBhDLARIsAHBOftoLObBYpXeJcCaLLaOUitI51sD4IgVZolcxnS4TrqYY-qzI5pLFF00aAkiWEALw_wcB");
		
		 driver.findElement(By.id("denyBtn")).click();
		 
		 Actions act = new Actions(driver);
		 
		 
		WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		Thread.sleep(2000);
		
		WebElement target2 = driver.findElement(By.xpath("//div[text()='Filter by']"));
		
		for(int i = 1;i<=2;i++)
		{
			act.doubleClick(target2).perform();
			act.clickAndHold(target2).perform();
			
		}
		

	Robot robot = new	Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_C);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_C);
	//identify search box
	driver.findElement(By.id("search_query_top_elastic_search"));
	
	//paste the filter by
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	
	
	
	
	
	
		
		
		
		
		

	}

}
