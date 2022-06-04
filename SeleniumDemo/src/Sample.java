import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver() ;
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    
	     driver.manage().window().maximize();
	     driver.get("https://in.search.yahoo.com/?fr2=inr"); 
	
	    String search = "selenium";
	     
	     driver.findElement(By.xpath("//input[@id='yschsp']")).sendKeys(search);
	     
	     Thread.sleep(2000);
	     List <WebElement>Dropresult =driver.findElements(By.xpath("//li[@class='sa-item prog-sugg']//span"));
	      for(WebElement el:Dropresult) {
	    	   System.out.println(el.getSize());
	    	 String result=el.getText();
	   	
	      if(result.equalsIgnoreCase("selenium interview questions")) {
	    	el.click();
	    	 break;
	    	
	      } 
	    
	}
		
	      driver.close();
	}

}
