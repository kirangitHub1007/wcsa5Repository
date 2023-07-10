package readPropertiFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readDataFromProperti {

	public static void main(String[] args) throws IOException {
		// TO read data from properties file
		
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		//create obj of properties class
		
		Properties prop = new Properties();
		//to load properties
		
		prop.load(fis);
		//to make file ready to read 
		
		String data = prop.getProperty("Url");
		System.out.println(data);

	}

}
