import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokanLink {

	public static void main(String[] args) throws  IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver() ;
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    
	     driver.manage().window().maximize();
	     driver.get("https://demo.guru99.com/test/newtours/index.php"); 
	     
	     //wait
	     Thread.sleep(5000);
	     
	     //Capture  all  Link from Webpage
	     
	     List <WebElement>links=driver.findElements(By.tagName("a"));
	     
	     //Number of links
	     System.out.println(links.size());
	     
	     for(int i=0; i<links.size();i++) {
	    	 
	    	 //by using href attribute we can get url of required link
	    	WebElement element=links.get(i);
	    	String url=element.getAttribute("herf");
	    	 
	    	URL link= new URL(url);
	    	
	    	
	    	HttpURLConnection httpConn=(HttpURLConnection)link.openConnection();
	    	
	    	//wait time 2sec
	    	Thread.sleep(2000);
	    	//establish connection
	    	httpConn.connect();
	    	
	    int responscode=httpConn.getResponseCode();
	    
	    if( responscode>4000) {
	    	System.out.println(url+"-"+ "Link is brokan");
	    	
	    }else {
	    	System.out.println(url+"-"+ "link is valid");
	    }
	    	
	     }
	     
	     
	

	}

}
