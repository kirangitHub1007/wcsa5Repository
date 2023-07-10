package methodsWebDrivr;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://omayo.blogspot.com/");
		 //get  handle of current or parent webpage
		String parentHand = driver.getWindowHandle();
		System.out.println("add of parent webpage"+parentHand);
		
		//get handle of child window
		driver.findElement(By.linkText("Open a popup window")).click();
		//get the handle or addrss of child window only
		
    //	String childHand = driver.getWindowHandle();
	//System.out.println("add of parent webpage"+childHand);
		
		
		
		Set<String> alladd = driver.getWindowHandles();
		//to read address use for looop
		for(String wh:alladd)
		{
			System.out.println(wh);
		}
		
		
	
		

	}

}
