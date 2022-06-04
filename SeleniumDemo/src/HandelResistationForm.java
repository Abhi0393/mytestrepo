import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandelResistationForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver() ;
	     driver.get("https://nxtgenaiacademy.com/demo-site/"); 
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     
	    WebElement FirstName= driver.findElement(By.id("vfb-5"));
	    FirstName.sendKeys("Abhijit");
	    WebElement LastName= driver.findElement(By.xpath("//input[@id='vfb-7']"));
	     LastName.sendKeys("Kadu");
	     
	    driver.findElement(By.xpath("//input[@id='vfb-8-1']")).click();
	    driver.findElement(By.xpath("//input[@id='vfb-13-address']")).sendKeys("Dastur Nagar,Amravati , maharashtra, India-446001");
	    driver.findElement(By.xpath("//input[@id='vfb-13-address-2']")).sendKeys("022,Dastur nagar road");
	    driver.findElement(By.xpath("//input[@id='vfb-13-city']")).sendKeys("Amravti");
	    driver.findElement(By.xpath("//input[@id='vfb-13-state']")).sendKeys("Maharashtra");
	    driver.findElement(By.xpath("//input[@id='vfb-13-zip']")).sendKeys("446001");
	    
	    Select sel = new Select (driver.findElement(By.xpath("//select[@id='vfb-13-country']")));
	    
	    sel.selectByVisibleText("India");
	    
	    driver.findElement(By.xpath("//input[@id='vfb-14']")).sendKeys("abc23@gmail.com");
	    String Month ="May";
	    String Year= "2022";
	    String Date="20";
	    
	    driver.findElement(By.xpath("//input[@id='vfb-18']")).click();
	  String monthyear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
	  System.out.println(monthyear);
	    String []arr=monthyear.split(" ");
	            
	    String mon =arr[0];
	    String yer=arr[1];
	    
	    //Selecting Month &Year
	   while(true) {
		   
		   if(mon.equalsIgnoreCase(Month) && yer.equalsIgnoreCase(Year))
		   {
			   break;
		   }
		   else {
			   driver.findElement(By.xpath("//span[text()='Next']")).click();
		   }
		   
	   }
	    // selecting Date
	  List<WebElement>allDate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	  for(WebElement el:allDate) {
		  String dt=el.getText();
		  
		  if (dt.equals(Date)) {
			  el.click();
			  break;
		  }
	  }
	      
	   Select s= new Select (driver.findElement(By.xpath("//select[@id='vfb-16-hour']")));
	   s.selectByValue("04");
	   driver.findElement(By.xpath("//input[@id='vfb-19']")).sendKeys("8324562343");
	   
	   driver.findElement(By.xpath("//input[@id='vfb-20-3']")).click();
	   
	   driver.findElement(By.xpath("//textarea[@id='vfb-23']")).sendKeys("Just For Practice");
	   
	    driver.findElement(By.xpath("//input[@id='vfb-3']")).sendKeys("22");
	    
	  driver.findElement(By.xpath("//input[@id='vfb-4']")).click();
	    
	    Thread.sleep(5000);
	    
	}  

}
