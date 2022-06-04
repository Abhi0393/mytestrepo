import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelsFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver() ;
	     driver.manage().window().maximize();
	     driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html"); 
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     // for Switching frame - by 1st method by id or name vallue
	     driver.switchTo().frame("classFrame");
		  driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();
		  Thread.sleep(2000);
		//to return to parent frame
		 driver.switchTo().defaultContent();
		 
		 // switch to other frame by 2nd method - by index no 
		 
		  driver.switchTo().frame(1);
		  driver.findElement(By.xpath("//a[text()='AbstractFindByBuilder']")).click();
		  Thread.sleep(2000);
		  
		// switch to parent frame
		  driver.switchTo().parentFrame();
		  
			 // switch to other3rd frame by 3rd method - by index no 
			 
		  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='packageListFrame']")));
		  
		  driver.findElement(By.linkText("org.openqa.selenium")).click();     
		  Thread.sleep(2000);
		  
		  
		  driver.close();
		
	}

}
