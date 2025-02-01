package Day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) {
		
		
	     // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to the webpage
        driver.get("https://demo.opencart.com/admin/index.php");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath(""))
        
	}

}
