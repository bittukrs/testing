package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		
		
		
		  WebDriver driver = new ChromeDriver();

	    
	        // Navigate to the Myntra website
	        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	        // Maximize the browser window
	        driver.manage().window().maximize();
	        // isDisplayed()
	        
	       // WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	        
	     //   System.out.println("Display status of logo:"+logo.isDisplayed()); //true
	        
	        
	  //boolean status= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	 //  System.out.println("display status:"+status);
	        
	        
	        //isEnable()
	 //   boolean status=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
	    
	   // System.out.println("Enable status: " + status); // true
	        
	        
	        //isselected()
	        
	  WebElement male_rd= driver.findElement(By.xpath("//input[@id='gender-male']"));
	  
	  WebElement female_rd= driver.findElement(By.xpath("//input[@id='gender-female']"));
	  
	  System.out.println("Before selection.................");
	  
	  System.out.println(male_rd.isSelected());//false  
	  System.out.println(female_rd.isSelected());// false
	  
	  
	  System.out.println("After selection male..............");
	  male_rd.click();// select male radio button
	  
	  
	  System.out.println(male_rd.isSelected()); // TRUE
	  System.out.println(female_rd.isSelected());// FALSE
	  
	  System.out.println("After selection female.....");
	  
	  female_rd.click(); // select female radio button
	  
	  System.out.println(male_rd.isSelected()); // FALSE
	  System.out.println(female_rd.isSelected()); // TRUE
	  
	  
	boolean newsletterstatus=  driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
	System.out.println("News letter checkbos status:"+ newsletterstatus);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        

		
	}

}
