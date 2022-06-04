import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			WebElement from= driver.findElement(By.xpath("//a[text()=' BANK ']"));
			
			WebElement to=driver.findElement(By.xpath("//ol[@id='bank']"));
			
			// create action class instance
			Actions act = new Actions (driver);
			//by using drag&drop
			act.dragAndDrop(from, to).build().perform();
			// by using clik&hold
			//act.clickAndHold(from).moveToElement(to).release().build().perform();
			Thread.sleep(2000);
			
		//	driver.close();
			
			
		
	}

}
