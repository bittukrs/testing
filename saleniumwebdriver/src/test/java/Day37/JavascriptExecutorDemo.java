package Day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

    public static void main(String[] args) {
        
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the webpage
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        
        //(Passing the text into inputbox (alternate of (sendkeys())  Locate the input box and set value using JavascriptExecutor
        WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value', 'john')", inputbox);
        
        // (clicking) on element - alternate of class ) Locate the radio button and click using JavascriptExecutor
        WebElement radiobtn = driver.findElement(By.xpath("//input[@id='male']"));
        js.executeScript("arguments[0].click()", radiobtn);
        
    }
}
