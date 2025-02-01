package Day37;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomout {

	public static void main(String[] args) throws InterruptedException {
		
		
		  WebDriver driver = new ChromeDriver();

	        // Navigate to the webpage
	        driver.get("https://demo.nopcommerce.com/");
	      //  Thread.sleep(5000)
	       // driver.manage().window().minimize();
	       // Thread.sleep(5000);
	        driver.manage().window().maximize();
	        Thread.sleep(5000);

	        // Create JavaScript Executor instance
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	        js.executeScript("document.body.style.zoom='50%'");
	        Thread.sleep(5000);
	        
	        js.executeScript("document.body.style.zoom='80%'");
	        Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
