package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bluestoneFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		// clicking chat box of blue stone using frame
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=Cj0KCQjwnMWkBhDLARIsAHBOftoLObBYpXeJcCaLLaOUitI51sD4IgVZolcxnS4TrqYY-qzI5pLFF00aAkiWEALw_wcB");
		 
		 driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		 //switch your control to chat box frame 
		 // handling the frame by frame(int index)
		 
		 //  handling the frame by frame(string id)
		 driver.switchTo().frame("fc_widget");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='chat-icon']"))).click();
		
		//handle by frame(webelement ftameE)
		
		
		//to pass the value we need to pass control to main  webpage 
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-name")).sendKeys("bhakti");
		driver.findElement(By.id("chat-fc-email")).sendKeys("bh@123.gmail");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("1234");

		
		 

	}

}
