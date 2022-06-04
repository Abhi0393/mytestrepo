package selaniumLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_IdName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		 driver.get("https://www.facebook.com/");
		 
		 WebElement email =driver.findElement(By.id("email"));
		 WebElement Pass = driver.findElement(By.id("passContainer"));
		 
		 WebElement loginbtn=driver.findElement(By.xpath("//button[@id='u_0_d_s2']"));
		 email.sendKeys("9876542222");
		 Pass.sendKeys("Ak@22333");
		 loginbtn.click();
		 
		 
	}

}
