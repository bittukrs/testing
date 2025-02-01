package Day25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesDemo {

    public static void main(String[] args) throws InterruptedException {
        // Set up WebDriver for Chrome
        WebDriver driver = new ChromeDriver();

        // Open the target URL
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        driver.manage().window().maximize();

        // Use self axis to select the current node
        String text= driver.findElement(By.xpath("//a[contains(text(), 'LIC')]/self::a")).getText();
         
        System.out.println("self: " + text);
        
      
	//Parent - selector the parent of the current node (always One)            
  text= driver.findElement(By.xpath("//a[contains(text(), 'LIC')]/parent::td")).getText();
          
          System.out.println("parent:" + text);
       // Child - select all the children of the current node (One or More)
          List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'LIC')]/ancestor::tr/child::td"));
          System.out.println("Number of child Elements: " + childs.size()); // 
          
          
          //Ancestor- select all the ancestor(parent, grandparent, etc)
          driver.findElement(By.xpath("//a[contains(text(), 'LIC')]/ancestor::tr")).getText();
          System.out.println("Ancestor: "+text);
          
      
         //Descendant - select all descendant(children, grandchildren, etc.) of the curent node
           List<WebElement> descendant = driver.findElements(By.xpath("//a[contains(text(), 'LIC')]/ancestor::tr/descendant::*"));
           System.out.println("Number of descendant nodes:"+ descendant.size()); 
           
           
        // Following - Selects everything in the document after the closing tag of the current node
           List<WebElement> followingNodes = driver.findElements(By.xpath("//a[contains(text(), 'LIC')]/ancestor::tr/following::tr"));

           System.out.println("Number of following nodes: " + followingNodes.size());
           
       
    
          // Preceding - Selects all nodes in the document before the current node in the document
             List<WebElement> precedings = driver.findElements(By.xpath("//a[contains(text(), 'LIC')]/ancestor::tr/preceding::tr"));

             System.out.println("Number of preceding nodes: " + precedings.size());
          // Following-sibling: Selects all siblings after the current node
             List<WebElement> followingsiblings = driver.findElements(By.xpath("//a[contains(text(), 'LIC')]/ancestor::tr/following-sibling::tr"));

             System.out.println("Number of following siblings: " + followingsiblings.size());
             
             
             // Preceding-siblings - Select all the sibling before the current node
             List<WebElement> precedingsibling= driver.findElements(By.xpath("//a[contains(text(), 'LIC')]/ancestor::tr/preceding-sibling::tr"));
             System.out.println("Number of preceding siblings: "+ precedingsibling.size());
               

           
           
           
           
		 
	}
}
