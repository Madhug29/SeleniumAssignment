package GermanyIsCalling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuccessfulLogin {

	public static void main(String[] args) throws InterruptedException {
	     WebDriver driver = new ChromeDriver();
	        driver.get("https://app.germanyiscalling.com/common/login/");
	        driver.findElement(By.id("username")).sendKeys("mg1231@gmail.com");
	          driver.findElement(By.id("password")).sendKeys("Mg1231@2901"); 
	          driver.findElement(By.xpath("//button[@type='submit']")).click();
	          System.out.println("Test passed:Successfully Login");
	          driver.quit();
	}
}
