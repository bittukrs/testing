package Day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions {

    public static void main(String[] args) {
        
     
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        
            // Navigate to the webpage
            driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html");
            driver.manage().window().maximize();

            // Initialize Actions class
            Actions act = new Actions(driver);
               //drag and drop 1
            // Perform drag and drop for Rome to Italy
            WebElement rome = driver.findElement(By.xpath("//div[@id='dropContent']//div[@id='box7']"));
            WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));
            act.dragAndDrop(rome, italy).perform();
            System.out.println("Drag and drop action performed for Rome to Italy.");
            //drag and drop 2
            // Perform drag and drop for Washington to the United States
            WebElement washington = driver.findElement(By.xpath("//div[@id='dropContent']//div[@id='box3']"));
            WebElement unitedStates = driver.findElement(By.xpath("//div[@id='box103']"));
            act.dragAndDrop(washington, unitedStates).perform();
            System.out.println("Drag and drop action performed for Washington to the United States.");

        
    }
}
