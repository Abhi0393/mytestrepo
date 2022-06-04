import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDatePickerCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver() ;
	     driver.get("https://www.redbus.in/"); 
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     
	     String year="2022";
	     String Month= "July";
	     String Date= "30";
	     
	     driver.findElement(By.xpath("//input[@id='onward_cal']")).click();

	     while (true){
	    	 
	    	String monthyear= driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
	    	 
	    	String []arr=monthyear.split(" ");
	    	
	    	String mon=arr[0];
	    	String yer=arr[1];
	    	
	    	if(mon.equalsIgnoreCase(Month) && yer.equalsIgnoreCase(year))
	    	{
	    		break;
	    	}
	    	
	    	 
	    	else {
	    		
	    		driver.findElement(By.xpath("//button[text()='>']")).click();
	    	}
	    	 
	     }
	    // date Selection
	     
          List<WebElement>allDate= driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
          
          for(WebElement ele :allDate)
          {
        	  String dt=ele.getText();
        	  
          
          if(dt.equals(Date)) {
        	  ele.click();
        	  break;
          }
        	  
          
	}

}
}