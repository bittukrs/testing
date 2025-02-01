package Day36;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

    public static void main(String[] args) {

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

        // Enter text in the first textarea
        driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome");

        // Create an Actions object
        Actions act = new Actions(driver);

        // Ctrl+A - Select the text
        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

        // Ctrl+C - Copy the selected text
        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

        // TAB - Shift focus to the second textarea
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

        // Ctrl+V - Paste the text
        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

      
    }
}
