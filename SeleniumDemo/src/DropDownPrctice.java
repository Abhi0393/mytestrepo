import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPrctice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver() ;
	     driver.get("https://demoqa.com/select-menu"); 
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     // select class
			/*
			 * Select sel = new
			 * Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
			 * sel.selectByIndex(0); Thread.sleep(2000); sel.selectByVisibleText("Blue");
			 * 
			 * List<WebElement>list= sel.getOptions(); for (WebElement wb:list) {
			 * System.out.println(wb.getText()); }
			 */
	     Select sel = new Select(driver.findElement(By.id("cars")));
	     sel.selectByIndex(0);
	     sel.selectByVisibleText("Saab");
	     sel.selectByVisibleText("Audi");
	}

}

