import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToTakeScreenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver() ;
	     driver.get("https://www.redbus.in/"); 
	     driver.manage().window().maximize();
	     
	     TakesScreenshot ts= (TakesScreenshot) driver;
		
                 File file= ts.getScreenshotAs(OutputType.FILE);
                 
               
	}

}
