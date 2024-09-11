package GermanyIsCalling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		   driver.get("https://app.germanyiscalling.com/common/login/?next=https%3A%2F%2Fapp.germanyiscalling.com%2Fcv%2Fhome%2F");
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath("//a[@href='/common/signup/']")).click();
	       Thread.sleep(2000);  
	       driver.findElement(By.id("first_name")).sendKeys("Madhu1");
	       driver.findElement(By.id("username")).sendKeys("mg1231@gmail.com");
	       driver.findElement(By.id("password")).sendKeys("Mg1231@2901");
	       driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
	         Thread.sleep(3000); 
	        System.out.println("Successfully sign Up with New email");

	}

}