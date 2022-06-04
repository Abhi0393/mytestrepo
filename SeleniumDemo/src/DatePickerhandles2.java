import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerhandles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver() ;
	     driver.get("https://www.goibibo.com/"); 
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     

		    
		    
		    String Month ="May";
		    String Year= "2022";
		    String Date="28";
		    
		    driver.findElement(By.xpath("//div[@class='header__conts']//div[3]//div[1]")).click();
		 String MonthYear=driver.findElement(By.xpath("//div[text()='April 2022']")).getText();
		  System.out.println(MonthYear);
		 String []arr=MonthYear.split(" ");
		 String mon =arr[0];
		 
		 String yer=arr[1];
		  
		   while(true) {
			   
			   if(mon.equalsIgnoreCase(Month) && yer.equalsIgnoreCase(Year))
			   {
				   break;
			   }
			   else {
				   driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			   }
			   
		   }
		    // selecting Date
		  List<WebElement>allDate=driver.findElements(By.xpath("//div[@class='DayPicker-Body']"));
		  
		  for(WebElement el:allDate) {
			  String dt=el.getText();
			  
			  System.out.println(dt);
			  if (dt.equals(Date)) {
				  el.click();
				  break;
			  }
		  
		      
		
	}
	}
}

