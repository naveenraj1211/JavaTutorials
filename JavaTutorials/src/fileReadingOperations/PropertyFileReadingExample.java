package fileReadingOperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PropertyFileReadingExample {

	public static void main(String[] args) throws IOException
	{

		FileInputStream fileInputStream = new FileInputStream("config.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		String browser = properties.getProperty("browser");
		String driverlocation = properties.getProperty("ChromeDriverlocation");
		WebDriver driver;
		
		if(browser.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", properties.getProperty("ChromeDriverlocation"));
			driver = new ChromeDriver();
		}
		else 
		{		
			System.setProperty("webdriver.ie.driver",properties.getProperty("IEdriverlocation"));
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		
	}

}
