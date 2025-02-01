package Day32;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

    public static void main(String[] args) {
        
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to the webpage
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        
        // 1) Find the number of rows in the table
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("Number of rows: " + rows); // 7

        // 2) Find the total number of columns in the first row (header row)
        int cols = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
        
        // If there are no header columns (th), fallback to counting td in the first row
        if (cols == 0) {
            cols = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//td")).size();
        }
        System.out.println("Number of columns: " + cols);
        
        // 3) Read data from a specific row and column (e.g., 5th row and 1st column)
        String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
        System.out.println("Book in 5th row, 1st column: " + bookname); // Example: "Master in Selenium"
        
   /*     // 4) Read data from all rows and columns
        System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
        for (int r = 2; r <= rows; r++) { // Start from row 2 to skip header row (if any)
            for (int c = 1; c <= cols; c++) { // Start from column 1 (or th if header exists)
                String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]")).getText();
                System.out.print(value + "\t");
            }
            System.out.println(); // Move to the next line after printing each row
        }
        
        */
        
        
        //5) Print book names whole author is Mukesh
        
      /*  for(int r=2; r<=rows; r++) {
        	
        String authorname=	driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
        
        if(authorname.equals("Mukesh")) {
        	
        	
        String Bookname=	driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
        
        System.out.println(Bookname+"\t"+authorname);
        
        */
        //6) Find the total price of book 
        
        
        int total=0;
        for(int r=2; r<=rows; r++) {
        	
        	
     String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
     total=total+Integer.parseInt(price);
     
    
        	
        }
        System.out.println("Total price of the books:"+total);
        
        
        
        
        
        

        
        
        
        

        }
       
        
        
        
        
        
    
        
        
        
        
        
        
   
    }

