import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver() ;
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    
	     driver.manage().window().maximize();
	     driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
	     
	     driver.manage().window().maximize();
	     
	  WebElement releasedate = driver.findElement(By.xpath(" //tbody/tr[12]/td[1]/div[1]"));
	  
	 String ReDate =releasedate.getText();
	 System.out.println(ReDate);
	 
	}

}
