import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelRedBusSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver() ;
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    
	     driver.manage().window().maximize();
	     driver.get("https://www.redbus.in/"); 
	     WebElement from= driver.findElement(By.id("onward_cal"));
	     from.click();
	     Thread.sleep(3000);
	     
	     String Month = "May";
	     String year= "2022";
	     String Date= "5";
	     
	    WebElement MonthYear= driver.findElement(By.xpath("//td[text()='May 2022']"));
	       String Data=MonthYear.getText();
	       
	       String []arr=Data.split(" ");
	      String mon=arr[0];
	      String yer=arr[1];
	     while(true) {
	      if (Month.equalsIgnoreCase(Month) && year.equalsIgnoreCase(yer)) {
	    	  break;
	      }else {
	    	  driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
	      }
	    	  
	    	  
	      }
	  
	     
	     List<WebElement>city=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
	     
	     for(WebElement el:city) {	
	    	 
	    	 if(el.getText().equalsIgnoreCase(Date)) {
	    		 el.click();
	    		 break;
	    	 }
	    	 
	     }
	     
	     
	}
}
