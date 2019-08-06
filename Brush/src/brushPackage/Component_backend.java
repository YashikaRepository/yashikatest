package brushPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Component_backend {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C:\\drive\\geckodriver.exe");
		
WebDriver driver = new FirefoxDriver();
		driver.get("http://34.209.253.65/cpanel");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/input[1]")).sendKeys("bb@boardandbrush.com");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/input[2]")).sendKeys("123456");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"evTempName\"]")).sendKeys("123456");
		
		//html/body/div[2]/ul/li[3]/a
		//driver.findElement(By.xpath("/html/body/div[2]/ul/li[3]/a")).click();

		
		
		//html/body/div[2]/ul/li[3]/ul/li[2]/a
		//driver.findElement(By.linkText("Add Project")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
