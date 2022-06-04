package handelMurcuryTourWebsite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelFlipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver() ;
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    
	     driver.manage().window().maximize();
	     driver.get("https://www.flipkart.com/"); 
	

	}

}
