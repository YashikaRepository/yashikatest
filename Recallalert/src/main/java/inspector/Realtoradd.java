package inspector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Realtoradd {
	
	
	@Test
	
public void login() {
		
		
		
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\drive\\geckodriver.exe");
			
			//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();


			driver.get("http://ec2-15-206-63-201.ap-south-1.compute.amazonaws.com/inspector-login");
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("james");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345678");
			
			driver.findElement(By.xpath("//html/body/div[3]/div/div/div[2]/div[2]/form/div[3]/input")).click();
			
			///html/body/div[2]/div/div/div[2]/ul/li[5]/a  
			//click on Manage Realtor
			driver.findElement(By.xpath("//html/body/div[2]/div/div/div[2]/ul/li[5]/a")).click();
			
			
			////*[@id="first_name"]  Enter Realtor fname
			
			driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("JACK");
			////*[@id="last_name"] Enter last name
			
			driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Depp");
			
			////*[@id="email"]  Enter Realtor  Email address
			
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("deep.lamba@effectualtech.com");
			
			
			
			////*[@id="Save"] Now click on save BUTTON
			
			driver.findElement(By.xpath("//*[@id=\"Save\"]")).click();
			
			
			////*[@id="select_client"]  Select Realtor from the dropdown
			
			driver.findElement(By.xpath("//*[@id=\"select_client\"]")).click();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	
	
	
	
	
	}
	
	

}
