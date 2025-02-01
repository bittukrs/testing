package Day38;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


/*Test  case
----------

1) Launch browser (chrome)
2) Open URL https://demo.opencart.com/
3) Validate title should be "Your Store"
4) close browser
*/

public class HeadlessTesting {

    public static void main(String[] args) {

        // Set the path for the ChromeDriver
      //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bittu Kumar\\Downloads\\chromedriver-win64\\chromedriver.exe.exe");

        //1) Launch browser(chrome)
       WebDriver driver = new ChromeDriver();

    	
  
     //2)  open URL https://demo.opencart.com/
       driver.get("https://demo.opencart.com/");
        
        //3) Validate title should be " your Store"
        
        
         String act_title=driver.getTitle();
         
         if(act_title.equals("Your Store")) {
        	 
        	 System.out.println("Test Passed");
         
         }
         else {
        	 System.out.println("Test  Failed");
         }
         //4) close browser
        //driver.close();
         //driver.quit();
    }
}
