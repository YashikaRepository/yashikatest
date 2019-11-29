package RecallAGRPID.Recallalert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Adminl {
	
	@Test
	public void pop() {
	
	
	
	
	
System.setProperty("webdriver.gecko.driver", "C:\\drive\\geckodriver.exe");
	
	//WebDriver driver = new ChromeDriver();
WebDriver driver = new FirefoxDriver();


	driver.get("http://ec2-15-206-63-201.ap-south-1.compute.amazonaws.com/admin-login");
	
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("etech1234");
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/input[2]")).click();
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	

}
