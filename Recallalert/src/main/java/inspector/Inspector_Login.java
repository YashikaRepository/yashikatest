package inspector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Inspector_Login {
	
	@Test
	
	
	
	
	public void login() {
		
		
		
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\drive\\geckodriver.exe");
			
			//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();


			driver.get("http://ec2-15-206-63-201.ap-south-1.compute.amazonaws.com/inspector-login");
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("inspector");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("dummy123");
			
			driver.findElement(By.xpath("//html/body/div[3]/div/div/div[2]/div[2]/form/div[3]/input")).click();
			
			// add payment by clicking on payment button
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul/li[3]/a")).click();
			
			//update payment by clicnk on edit button //*[@id="update"]
			driver.findElement(By.xpath("//*[@id=\"update\"]")).click();
			
			
	
	}
	

}


