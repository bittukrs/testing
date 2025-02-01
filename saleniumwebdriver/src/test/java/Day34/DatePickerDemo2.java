package Day34;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {
	
	// user defined method for converting month from string---->Month
	
	 static Month convertMonth(String month) {
		 
		HashMap<String, Month>monthmap= new HashMap<String, Month>();
		
		monthmap.put("janauary", Month.JANUARY);
		monthmap.put("February", Month.FEBRUARY);
		monthmap.put("March", Month.MARCH);
		monthmap.put("April", Month.APRIL);
		monthmap.put("May", Month.MAY);
		monthmap.put("June", Month.JUNE);
		monthmap.put("July", Month.JULY);
		monthmap.put("August", Month.AUGUST);
		monthmap.put("September", Month.SEPTEMBER);
		monthmap.put("October", Month.OCTOBER);
		monthmap.put("November", Month.NOVEMBER);
		monthmap.put("December", Month.DECEMBER);
		
			Month vmonth = monthmap.get(month);
			if(vmonth == null) {
				System.out.println("Invalid month....");
			}
			
		
		return vmonth;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	 
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to the webpage
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // Input Dob
        String requiredYear = "2021";
        String requiredMonth = "June";
        String requiredDate = "15";

        // Open the date picker
        driver.findElement(By.xpath("//div[@class=\"date-picker-box\"]")).click();

        // Select year
        WebElement yearDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selectYear = new Select(yearDropDown);
        selectYear.selectByVisibleText(requiredYear);

        // Select month
        WebElement monthDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select selectMonth = new Select(monthDropDown);
        selectMonth.selectByVisibleText(requiredMonth);

        // Select date
        driver.findElement(By.xpath("//a[text()='" + requiredDate + "']")).click();

    
    }
}
