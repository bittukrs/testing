package Day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {

	public static void main(String[] args) {
		
		  WebDriver driver = new ChromeDriver();

	        
          // Navigate to the webpage
          driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
          driver.manage().window().maximize();
          
          
        WebElement button= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

          // Initialize Actions class
          Actions act = new Actions(driver);
          
   Action myaction= act.contextClick(button).build(); // create+complete
   myaction.perform();  //we are performing/completing action
     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
