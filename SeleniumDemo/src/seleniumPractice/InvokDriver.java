package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		/*there are two method to open our webpage
		1. get method
		2. navigate to method */
		
		 driver.get("https://www.google.co.in/");
		
	     //  driver.navigate().to("https://www.google.co.in/");
	     // to maximize window 
	      
	       driver.manage().window().maximize();
	       
	       driver.findElement(By.name("q")).sendKeys("AbhijitKadu");
	       
	     // to close current window 
	     
	   //    driver.close(); 
	       
	       // to close all window
	       
	       driver.quit();
	       
	       
	}

}
