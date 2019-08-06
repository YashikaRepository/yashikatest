package brushPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class Image {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://calendar.boardandbrush.com/test-site");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		//WebElement clik = new driver.findElement(By.x
		driver.findElement(By.xpath("//span[contains(@class,'fc-title\') and contains(text(), 'Grand Opening')]")).click();
		
		//driver.findElement(By.xpath("//span[contains(@class,'fc-title\') and contains(text(), 'Grand Opening')]")).click();
		//driver.findElement(By.xpath("//div[contains(contains@class,'evp-left')][a[text()='Grand Opening - No Registration Necessary']")).click();
		
	 driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[4]/div[2]/div/div[1]/div/div/div[1]/h5")).click();
		
	 driver.findElement(By.xpath("*//button[@type='button'] and //id[@id = '2885']")).click();

}
	}
