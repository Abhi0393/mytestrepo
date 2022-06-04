import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	
	public static void main(String[] args) throws AWTException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver() ;
	     driver.get("https://www.flipkart.com/"); 
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     driver.findElement(By.xpath("//button[text()='✕']")).click();
	     
	     Robot r = new Robot() ;
			/*
			 * r.keyPress(KeyEvent.VK_CONTROL); r.keyPress(KeyEvent.VK_T);
			 * r.keyRelease(KeyEvent.VK_CONTROL); r.keyRelease(KeyEvent.VK_T);
			 */
	     for(int i=1; i<=3; i++) {
	     
	   r.keyPress(KeyEvent.VK_PAGE_DOWN);
	     }
	   r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	   Thread.sleep(2000);
		/*
		 * for(int i=1; i<=3; i++) { r.keyPress(KeyEvent.VK_PAGE_UP);
		 * 
		 * } r.keyRelease(KeyEvent.VK_PAGE_UP); Thread.sleep(3000); // driver.close();
		 */	    
	}
}
