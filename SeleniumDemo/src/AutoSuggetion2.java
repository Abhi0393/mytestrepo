import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetion2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver() ;
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    
	     driver.manage().window().maximize();
	     driver.get("https://www.bing.com/"); 
	
	    String search = "speed";
	     
	     driver.findElement(By.id("sb_form_q")).sendKeys(search);
	     
	     Thread.sleep(2000);
	     List <WebElement>Dropresult =driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
	      for(WebElement el:Dropresult) {
	    
	    	 String result=el.getText();
	   	   
	      if(result.equalsIgnoreCase("speed test")) {
	    	el.click();
	    	 break;
	    	
	      } 
	    
	}
		
	      
	}

}
