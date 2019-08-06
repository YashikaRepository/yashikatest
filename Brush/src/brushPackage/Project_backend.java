package brushPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_backend {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://calendar.boardandbrush.com/cpanel");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/input[1]")).sendKeys("bb@boardandbrush.com");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/input[2]")).sendKeys("123456");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.linkText("Add Project")).click();
		
		

	}

}
