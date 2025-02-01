package Day36;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpentheNewTab {

    public static void main(String[] args) throws InterruptedException {
        
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

    
            // Navigate to the webpage
            driver.get("https://demo.nopcommerce.com/");
            driver.manage().window().maximize();

            // Locate the Register link
            WebElement reglink = driver.findElement(By.xpath("//a[normalize-space()='Register']"));

            // Create an Actions object
            Actions act = new Actions(driver);
            act.keyDown(Keys.CONTROL).click(reglink).keyUp(Keys.CONTROL).perform();

            // Add a small delay to allow the new tab to open
            Thread.sleep(2000);

            // Get all window handles
            List<String> ids = new ArrayList(driver.getWindowHandles());

            // Switch to the registration page
            driver.switchTo().window(ids.get(1)); // Switch to registration page
            driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("John");

            // Switch back to the home page
            driver.switchTo().window(ids.get(0)); // Switch to home page
            driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Tshirts");

    }
}
