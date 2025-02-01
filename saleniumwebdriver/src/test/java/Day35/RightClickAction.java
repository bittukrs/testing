package Day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

    public static void main(String[] args) throws InterruptedException {

    

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        
            // Navigate to the webpage
            driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
            driver.manage().window().maximize();

            // Locate the button element
            WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

            // Perform right-click action on the button
            Actions act = new Actions(driver);
            act.contextClick(button).perform();

            // Click on the 'Copy' option in the context menu
            driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();

            // Wait for the alert to appear
            Thread.sleep(2000);

            // Close the alert box
            driver.switchTo().alert().accept();

     
        }
    }
