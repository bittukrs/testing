package Day24;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		
		 WebDriver driver =new  ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//Xpath with single attribute
   //driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Tshirts");
//Xpath with multiple attribute

		//driver.findElement(By.xpath("//input[@name='search'] [@placeholder='search']")).sendKeys("Tshirts");
		  //xpath with 'and' operator
		//driver.findElement(By.xpath("//input[@name= 'search' and @placeholder='Search']")).sendKeys("Tshirts");
		//xpath with 'or' operator
		//driver.findElement(By.xpath("//input[@name= 'search' or @placeholder='xyz']")).sendKeys("Tshirts");
		
		//xpath with text()- inner text
		
	//	driver.findElement(By.xpath("//*[text()='Macbook']")).click();
		
		
		// Validate if the 'Featured' section is displayed
		//boolean displayStatus = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();

		// Print the display status
	//	System.out.println( displayStatus);
		
		//String value= driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		 
	 	// System.out.println(value);
		// XPath with contains()
		//driver.findElement(By.xpath("//input[contains(@placeholder, 'sea')]")).sendKeys("Tshirts");
		
		//xpath with start-with()
	//	driver.findElement(By.xpath("//input[starts-with(@placeholder, 'sea')]")).sendKeys("Tshirts");
		
		// Locate the input element whose placeholder starts with 'sea'
	//	driver.findElement(By.xpath("//input[starts-with(@placeholder, 'sear')]")).sendKeys("Tshirts");
       // chained xpath
	boolean status=	driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		
		
		System.out.println(status);


		
		
		
		 

	}

}
