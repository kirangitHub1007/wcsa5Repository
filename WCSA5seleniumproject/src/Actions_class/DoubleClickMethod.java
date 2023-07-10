package Actions_class;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class DoubleClickMethod {
//handling desttop popup by autoit and vbscript
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 //launch actitime
		 driver.get("http://laptop-fog9skhq/login.do");
		 
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click();
		 
		 //click on setting module
		 driver.findElement(By.xpath("(//img[@class='sizer'])[5]")).click();
		 
		 driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		  Thread.sleep(2000);
		  
		  //click on custom logo
		  driver.findElement(By.id("uploadNewLogoOption")).click();
		  WebElement target = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
		  // create obj of action class
		  Actions act = new Actions(driver);
		  act.doubleClick(target).perform();
		  
		 // file is getting open so integrate file  n pass path of file
		  
			File file = new File("./autoItPrograms/ActitimeFileUpload.exe");
			Thread.sleep(4000);
		    String absulatePath = file.getAbsolutePath();
			Runtime.getRuntime().exec(absulatePath);
			
			Thread.sleep(4000);
			Runtime.getRuntime().exec(absulatePath);
		 
		 
	}

}
