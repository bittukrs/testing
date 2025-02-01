package Day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        
        // get(url) - opens the URL on the browser
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        Thread.sleep(5000);
        
        // getTitle() - returns the title of the page
        System.out.println(driver.getTitle()); // Expected Output: OrangeHRM
        
        // getCurrentUrl() - returns the URL of the page
        System.out.println(driver.getCurrentUrl()); // Expected Output: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        
        // getPageSource() - returns the source code of the page
        // Uncomment the next line to print the page source
        // System.out.println(driver.getPageSource());
        
        // getWindowHandle() - returns the ID of the single browser window
        String windowid = driver.getWindowHandle(); // Removed extra closing parenthesis
        System.out.println("Window ID: " + windowid);//2C12CA3BA63C9819A03E4C8C985D55FC
                                                     // 6C7FDFF673D02182158E1A2D04F0A4
       // getWindowHandle() - returns ID's of the multiple browser windows
         driver.findElement(By.linkText("OrangeHRM, Inc")).click();
         
              Set<String>  windowids=driver.getWindowHandles();
            
			System.out.println(windowids);//[393C8C381848F4F873C51313DABE60E8, 78A54134681AC41451DBA685D4390951]
			
			
			
              
        
        
        
        
    }
}
