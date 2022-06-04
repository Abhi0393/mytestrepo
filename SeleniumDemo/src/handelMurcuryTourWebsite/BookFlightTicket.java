package handelMurcuryTourWebsite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookFlightTicket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver() ;
     driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/"); 
     driver.manage().window().maximize();
     
    /* WebElement Id =driver.findElement(By.xpath("//input[@name='userName']"));
     WebElement pass =driver.findElement(By.xpath("//input[@name='password']"));
     WebElement loginbtn = driver.findElement(By.xpath("//input[@name='submit']"));
      Thread.sleep(2000);
    Id.sendKeys("mercury");
    Thread.sleep(2000);
    pass.sendKeys("mercury");
    Thread.sleep(2000);
    loginbtn.click();*/
  //  driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]/select[1]")).click();
    System.out.println(driver.getTitle());
    
  //  driver.findElement(By.xpath("//div[@class='ns-xoklu-e-14 button-common close-button']"));
    
  //  driver.findElement(By.xpath("//input[@type='radio'and@name='tripType'][2]")).click();
   
  //  System.out.println(driver.getTitle());
    
    Select sel = new Select(driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]/select[1]")));
    sel.selectByValue("CUB");
    
  List<WebElement>wb=sel.getOptions();
  for(WebElement list :wb) {
  System.out.println(list.getText());
  }
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    
    
   // driver.quit();
     
     
     
     
     
     
    
		
		
		
	}

}
