package Day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();

		   
        // Navigate to the webpage
        driver.get("https://www.w3school.com/tags/tryit.asp?filename=tryhtml5_ev_onclick3");
        driver.manage().window().maximize();
        
    WebElement box1= driver.findElement(By.xpath("//input[@id='field1']"));
    WebElement box2= driver.findElement(By.xpath("//input[@id='field2']"));
       WebElement button=  driver.findElement(By.xpath("//button[normallize-space()='Copy Text']"));
       
       box1.clear();
       box1.sendKeys("Welcome");
       // double click actions on the button
       
       Actions act = new Actions(driver);
       act.doubleClick(button).perform(); 
       
       //validation : box2 should contains "WELCOME"
       
       String text=box2.getAttribute("value");
       System.out.println("captured value is:"+ text);
       if(text.equals("WELCOME")) {
    	   
    	   System.out.println("Text copied...");
    	   
       }
       else {
    	   System.out.println("Text Not copied properly..");
       }
       
		
		
		
		
		
		
		
		
		

	}

}
