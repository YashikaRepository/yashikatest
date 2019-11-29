package brushPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Booking {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\drive\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
				driver.get("http://34.209.253.65/cpanel");
				System.out.println(driver.getTitle());
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/input[1]")).sendKeys("bb@boardandbrush.com");
				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/input[2]")).sendKeys("Etech@123");
				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div/input")).click();
				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/input[3]")).click();
				
				driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div/div[1]/div[1]/div[1]/ul/li[4]/a")).click();
				
				
				
				driver.get("http://34.209.253.65/cpanel/edit-locationinfo?stId=150");
				
				driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]/a")).click();
				driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]/ul/li[2]/a")).click();
			
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
