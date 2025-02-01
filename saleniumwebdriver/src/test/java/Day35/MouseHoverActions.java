package Day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

    public static void main(String[] args) {

     

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

   
            // Navigate to the webpage
            driver.get("https://demo.opencart.com/");
            driver.manage().window().maximize();

            // Locate the "Desktops" menu element
            WebElement desktops = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));

            // Locate the "Mac (1)" submenu element
            WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

            // Perform mouse hover action
            Actions act = new Actions(driver);
            act.moveToElement(desktops).moveToElement(mac).click().build().perform();

        }
    }

