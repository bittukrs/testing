package Day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

    public static void main(String[] args) throws InterruptedException {

        // Set the WebDriver path if needed (use System.setProperty here)
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // Create JavaScript Executor instance
        JavascriptExecutor js = (JavascriptExecutor) driver;

     /*   // 1) Scroll down the page by a specific number of pixels
        js.executeScript("window.scrollBy(0, 1500)");
        System.out.println(js.executeScript("return window.pageYOffset;")); // Correct property name

        // 2) Scroll the page till the element is visible
        WebElement ele = driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
        js.executeScript("arguments[0].scrollIntoView();", ele);
        System.out.println(js.executeScript("return window.pageYOffset;")); // Correct property name
*/
        // 3) Scroll the page till the end of the page
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;")); // Fixed the typo 'retrun'

        Thread.sleep(5000);
        // 4) Scroll back up to the initial position
        js.executeScript("window.scrollBy(0, -document.body.scrollHeight)"); // Fixed 'scrollby' typo to 'scrollBy'

        // Close the browser
        driver.quit();
    }
}
