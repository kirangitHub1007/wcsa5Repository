package keyword_driven_framework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BestTest extends Flib implements IautoConstant{
	
	//use to open n close browser
	static WebDriver driver;
	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		String browserVlaue = flib.readPropertyData(PROP_PATH, "Browser2");
		String url = flib.readPropertyData(PROP_PATH,"Url");
		
		if(browserVlaue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_VALUE );
			 driver = new ChromeDriver();
			 
		}
		else if (browserVlaue.equalsIgnoreCase("edge"))
		{

			System.setProperty(EDGE_KEY,EDGE_VALUE );
                  driver = new EdgeDriver();
			
			  
		}
		else {
			System.out.println("enter valid value");
			}
		
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get(url);
	       
	}
	
	public void closeBrowser()
	{
	   driver.quit();
	}
	
	

}
