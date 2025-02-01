package Day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpilictWaitDemo {

    public static void main(String[] args) throws InterruptedException {

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Initialize WebDriverWait with a timeout of 10 seconds
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Open the website
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        // Maximize the browser window
        driver.manage().window().maximize();

        // Wait for the Username field to be visible and interact with it
        WebElement txtusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        txtusername.sendKeys("Admin");

        // Corrected XPath for the Password field
        WebElement txtpassword = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
        txtpassword.sendKeys("admin123");

        // Wait for the Login button to be clickable and click it
        WebElement txtloginbtn = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
        txtloginbtn.click();
    }
}
