package bpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Mclass {

	//first test case to lounge Firefor
		@Test
		public void pop() {
		
		
		
		
		
System.setProperty("webdriver.gecko.driver", "C:\\drive\\geckodriver.exe");
		
		//WebDriver driver = new ChromeDriver();
WebDriver driver = new FirefoxDriver();


		driver.get("http://34.209.253.65/project");
		
		//driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/div/div/div[3]/div[2]/table/tbody/tr[2]/td[5]/a/div")).click();
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/div/div/div[3]/div[2]/table/tbody/tr[2]/td/a/div")).click();
System.out.println("TEST STARTED");
		}
		
		
		
			
			
			
			
			
			
			
			
		
	}


