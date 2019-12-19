package customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Forgot_password {
	 
			
         @Test


         public void forgetpassword() {


System.setProperty("webdriver.gecko.driver", "C:\\drive\\geckodriver.exe");

//WebDriver driver = new ChromeDriver();
WebDriver driver = new FirefoxDriver();


driver.get("http://ec2-15-206-63-201.ap-south-1.compute.amazonaws.com/customer-login");
//Click on Forget password BUTTON

driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/form/div[4]/a")).click();


//Enter email of user for forget password link

driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("yashika.patodia@effectualtech.com");


driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();

//click on submit BUTTON
//driver.findElement(By.xpath("//*[@id=\"send\"]")).click();

// GO TO HOME PAGE> /html/body/div[1]/div[2]/div/div/ul/li[1]/a
//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/ul/li[1]/a")).click();












         }}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


