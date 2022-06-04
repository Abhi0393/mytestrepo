import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mouse_Hover_Operation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver() ;
	     driver.get("https://www.flipkart.com/"); 
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     
	     driver.findElement(By.xpath("//button[text()='✕']")).click();
	     Thread.sleep(2000);
	     WebElement electronic =driver.findElement(By.xpath("//div[text()='Electronics']"));
	     
	     Actions act =new Actions(driver);
	     // for mouse hover acton
	     act.moveToElement(electronic).build().perform();
	     
	     // to perform kebord action
	 WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
	 searchbox.sendKeys("lenevo");
	 act.sendKeys(Keys.ENTER).build().perform();
	 
	     

	     
		
	}

}
