import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver() ;
	     driver.manage().window().maximize();
	     driver.get("https://nxtgenaiacademy.com/alertandpopup/"); 
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
	     
	     //Switching to alert
	     Alert alt = driver.switchTo().alert();
	     
	     // capture the alert massege
	     String alertMassege =alt.getText();
	     
	     // print alert massege
	     System.out.println(alertMassege);
	     
	     // Accepting the Alert
	   //  alt.accept();
	    
	    // send data to alert box
		     alt.sendKeys("yes");
		     Thread.sleep(2000);
	     // cancle alert
	     alt.dismiss();
	     
	  
	     
	     
	     
	     
	}

}
