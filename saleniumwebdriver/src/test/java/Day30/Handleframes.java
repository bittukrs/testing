package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handleframes {

	public static void main(String[] args) {
		
		
		


		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Frame1
	WebElement	frame1=  driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(frame1); //passed frame as WebElement //switch to frame1
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
		
		driver.switchTo().defaultContent();
	//Frame2	
	WebElement frame2=	driver.findElement(By.xpath("//frame[@src= 'frame_2.html']"));
		
		driver.switchTo().frame(frame2);
		
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("salenium");
		
		driver.switchTo().defaultContent();//passed frame as WebElement //switch to frame2
		
		
		//Frame3
	 WebElement frame3=	driver.findElement(By.xpath("//frame[@src= 'frame_3.html']"));
	 
	 driver.switchTo().frame(frame3);
		
	 
	 driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java");
	   //inner iframe-part of 
	 driver.switchTo().frame(0);  // switching to frame index
	 
	// driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
	 
	WebElement rdbutton= driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']"));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
    js.executeScript("argument[0].click();",rdbutton);
	
	 
	 

	 
	 driver.switchTo().defaultContent();
    
		
		
		
		
		
		
		
		
		
		

		
	}

}
