package GermanyIsCalling;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class UnsuccessfulLogin {

		    public static void main(String[] args) throws InterruptedException {
		       WebDriver driver = new ChromeDriver();
		      driver.get("https://app.germanyiscalling.com/common/login/?next=https%3A%2F%2Fapp.germanyiscalling.com%2Fcv%2Fhome%2F");
  
		          driver.findElement(By.id("username")).sendKeys("madhugautam@gmail.com");
		          driver.findElement(By.id("password")).sendKeys("Madhu123"); 
		          driver.findElement(By.xpath("//button[@type='submit']")).click();
		           Thread.sleep(5000);
		           System.out.println("Test Passed: Login was Unsuccessful.");
		       
		            driver.quit();
		        }
		    
}
