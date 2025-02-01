package Day22;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LocatorsDemo {

	   public static void main(String[] args) {
	   	
         WebDriver driver=new ChromeDriver();
		
         driver.manage().window().maximize();
		 driver.get("https://myntra.com/");
		
		
		
		  //name
		 //driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
	     //boolean	logodisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logodisplaystatus);
		
		
		//linktext & partialLinKtext
      	//driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Table")).click();
		 
		 System.out.println()
		
		
		
        // classname
        // List<WebElement>headerLinks=driver.findElements(By.className("list-inline-item")); 
         // System.out.println("total number of header links:"+headerLinks.size());
       
        //tagname
         List<WebElement>links=driver.findElements(By.tagName("a"));
         System.out.println("total number of links:"+ links.size());
  
        // image 
        //  List<WebElement>images=driver.findElements(By.tagName("img"));
      
        //  System.out.println("total number of images:"+ images.size());
		
	   
			 
		
		
		
		
		
		
		
		
		
		
		
	}

}
