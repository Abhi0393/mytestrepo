import java.time.Duration;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelAutoSeggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver() ;
	     driver.manage().window().maximize();
	     driver.get("https://www.google.co.in/"); 
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	   // String search = "go";
	    
	 driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("java");
	  

	     Thread.sleep(2000);
	     List <WebElement>Dropresult =driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div//span"));
	      for(WebElement el:Dropresult) {  
	    	  
	    	  System.out.println(el.getSize());
	    	  String allresult= el.getText();
	 
	   	   
	      if(allresult.equalsIgnoreCase("javascript")) {
	    	el.click();
	    	 break;
	     
	      } 
	 	  
	}

	    
}
}