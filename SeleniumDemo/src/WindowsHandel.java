import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandel {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver() ;
	     driver.manage().window().maximize();
	     driver.get("https://nxtgenaiacademy.com/"); 
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	   //  driver.findElement(By.xpath("//button[text()='✕']")).click();
	     
	     Robot r = new Robot() ;
	     r.keyPress(KeyEvent.VK_CONTROL);
	     r.keyPress(KeyEvent.VK_T);
	     r.keyRelease(KeyEvent.VK_CONTROL);
	     r.keyRelease(KeyEvent.VK_CONTROL);
	    
	     // new tab Handels code
	     
	     // Store Windows id in set of String 
			  Set <String> set=driver.getWindowHandles(); 
			  // geting id form set by iterator
			  Iterator<String> itr=set.iterator();
			  String ParentWindows=itr.next(); 
			  String childWindows=itr.next();
			   driver.switchTo().window(childWindows); 
			  driver.navigate().to("https://nxtgenaiacademy.com/multiplewindows/");
			  driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
			  set=driver.getWindowHandles();
			  itr=set.iterator();
			  itr.next();
			  itr.next();
			  String ChildofChldWindows =itr.next();
			  driver.switchTo().window(ChildofChldWindows);
			  driver.get("https://demoqa.com/text-box");
			  driver.manage().window().maximize();
			 driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Done By Abhijit Kadu");
			  
			  // Switch To any Windows
			  driver.switchTo().window(ParentWindows);
		     System.out.println("Title Of Parent Window is:" +driver.getTitle());
	}
}

