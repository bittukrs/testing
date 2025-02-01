package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();

        // Click the dropdown to reveal options
        driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();

        // Capture all the options and find the size
        List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
        System.out.println("Number of options: " + options.size());

        // Printing options from dropdown
     //   for (WebElement op : options) {
        //    System.out.println(op.getText());
        //}

        // Selecting specific options from dropdown
        for (WebElement op : options) {
            String option = op.getText();

            if (option.equals("Java") || option.equals("Python") || option.equals("MySQL")) {
                op.click();
            }
        }
        
       
    }
}
