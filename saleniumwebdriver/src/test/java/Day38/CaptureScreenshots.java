package Day38;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

    public static void main(String[] args) {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to the webpage
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // 1) Take a full-page screenshot
     //   TakesScreenshot ts = (TakesScreenshot) driver;

        // Save the screenshot to a source file
      //  File sourceFile = ts.getScreenshotAs(OutputType.FILE);

        // Define the target file path
       // File targetFile = new File(System.getProperty("user.dir") + "\\Screenshots\\fullpage.png");
         // sourceFile.renameTo(targetFile);
         //2) capture the screenshit of specific section
 /*    WebElement featuredProducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
          File sourceFile = featuredProducts.getScreenshotAs(OutputType.FILE);

         
          File targetFile = new File(System.getProperty("user.dir") + "\\Screenshots\\featuredproducts.png");
            sourceFile.renameTo(targetFile);
            
            */
            //3) capture the screenshot of webelement
           WebElement logo= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
            File sourcefile = logo.getScreenshotAs(OutputType.FILE);

            
            File targetFile = new File(System.getProperty("user.dir") + "\\Screenshots\\logo.png");
              sourcefile.renameTo(targetFile);
          
       
     
    }
} 