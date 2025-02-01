package Day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {

    // Select a future date
    static void selectFutureDate(WebDriver driver, String year, String month, String date) {
        while (true) {
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            // Break the loop if the required month and year are found
            if (currentMonth.equals(month) && currentYear.equals(year)) {
                break;
            }

            // Click the next button to navigate through months
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }

        // Select the specific date
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td/a"));
        for (WebElement dt : allDates) {
            if (dt.getText().equals(date)) {
                dt.click();
                break;
            }
        }
    }

    // Select a past date
    static void selectPastDate(WebDriver driver, String year, String month, String date) {
        while (true) {
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            // Break the loop if the required month and year are found
            if (currentMonth.equals(month) && currentYear.equals(year)) {
                break;
            }

            // Click the previous button to navigate through months
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
        }

        // Select the specific date
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td/a"));
        for (WebElement dt : allDates) {
            if (dt.getText().equals(date)) {
                dt.click();
                break;
            }
        }
    }

    public static void main(String[] args) {
        // Set up ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

      
            // Navigate to the webpage
            driver.get("https://jqueryui.com/datepicker/");
            driver.manage().window().maximize();

            // Switch to frame containing the date picker
            driver.switchTo().frame(0);

            // Open the date picker
            driver.findElement(By.xpath("//input[@id='datepicker']")).click();

            // Expected date
            String year = "2025";
            String month = "May";
            String date = "15";

            // Select the future date
            selectFutureDate(driver, year, month, date);

            // Uncomment the below line to test past date selection
            // selectPastDate(driver, year, month, date);

    }
}
