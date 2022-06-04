import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickandRightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement rihtclik =driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act=new Actions(driver);
		// perform right click action
		//act.contextClick(rihtclik).build().perform();
	    //Thread.sleep(2000);
		WebElement doubleclick =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		// double click action
		act.doubleClick(doubleclick).build().perform();
		
		
		
		
		
		
		
		
		
		
	}

}
