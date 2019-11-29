package realtor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Realtor_Login {
	
	
	public class realtor_Login {
		
		@Test
		
		
		
		
		public void login() {
			
			
			
			
			
			System.setProperty("webdriver.gecko.driver", "C:\\drive\\geckodriver.exe");
				
				//WebDriver driver = new ChromeDriver();
			WebDriver driver = new FirefoxDriver();


				driver.get("http://ec2-15-206-63-201.ap-south-1.compute.amazonaws.com/realtor-login");
				
				
				driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("realtor");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("dummy12345");
				
				driver.findElement(By.xpath("//html/body/div[3]/div/div/div[2]/div[2]/form/div[3]/input")).click();

}}}
	
