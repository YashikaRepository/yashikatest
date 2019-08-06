package brushPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoLogin {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C:\\drive\\geckodriver.exe");
		
WebDriver driver = new FirefoxDriver();
		driver.get("http://34.209.253.65/cpanel");
           driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/input[1]")).sendKeys("bb@boardandbrush.com");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/input[2]")).sendKeys("123456");
		
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/input[3]")).click();
		//add location 
		driver.findElement(By.xpath("/html/body/div[2]/ul/li[1]/ul/li[1]/a")).click();
		
		//For enter studio number
		driver.findElement(By.id("stNumber")).sendKeys("455");
		
		
		driver.findElement(By.xpath("//*[@id=\"stStatus\"]")).sendKeys("/html/body/div[4]/div/form/div[2]/div[1]/div[2]/select/option[2]");
		
		
		
		//Enter Studio Name 
		driver.findElement(By.id("stName")).sendKeys("Soit Magnifique");
		//IMloder1
		//driver.findElement(By.xpath("/html/body/div[4]/div/form/div[2]/div[2]/div[3]/div[1]/div[1]/div/div/div/label/i")).sendKeys("C:\\Users\\ADMINGR-7U78G74\\Desktop");
		//WebElement uploadElement=driver.findElement(By.id("img-upload1"));
		
		//uploadElement.sendKeys("C:\\img\\cuteme.jpg");
		
		//driver.find//Element(By.xpath("/html/body/div[4]/div/form/div[2]/div[2]/div[3]/div[1]/div[1]/div/div/div/label/i")).click();
		
		//driver.findElement(By.id("flpup1")).sendKeys("C:\\Users\\ADMINGR-7U78G74\\Desktop\\20171018scTrax01-1536810341.jpg");
		//driver.findElement(By.xpath(".//*[@id='btnSave'] and @class='yellow-btn'")).click();
		//driver.findElement(By.id("flpup1")).click();
		//driver.findElement(By.xpath(".//div[contains(@id='btnStudio')]")).click();
		driver.findElement(By.xpath("//*[@id=\"slug\"]")).sendKeys("beauty");
		//WebElement uploadElement = driver.findElement(By.id("img-upload1"));
		//uploadElement.sendKeys("C:\\newhtml.html");
		driver.findElement(By.xpath("//*[@id=\"stOwner\"]")).sendKeys("Yashika patodia");
		driver.findElement(By.xpath("//*[@id=\"stContactInfo\"]")).sendKeys("Yashika patodia CONTACT");
		
		driver.findElement(By.xpath("//*[@id=\"stStreetAddress\"]")).sendKeys("beauty");
		driver.findElement(By.xpath("//*[@id=\"stAddress1\"]")).sendKeys("beauty address");
		driver.findElement(By.xpath("//*[@id=\"stCity\"]")).sendKeys("beauty address");
		
		// for staate ropdown 
		//*[@id="stState"]
		driver.findElement(By.xpath("//*[@id=\"stState\"]")).sendKeys("/html/body/div[4]/div/form/div[2]/div[2]/div[3]/div[1]/div[2]/div/div[4]/select/option[9]");
		
		driver.findElement(By.xpath("//*[@id=\"stZip\"]")).sendKeys("99999");
		driver.findElement(By.xpath("//*[@id=\"stPhone\"]")).sendKeys("8557056606");
		driver.findElement(By.xpath("//*[@id=\"stEmail\"]")).sendKeys("YASHIKAPATODIA27@ICLOUD.COM");
		
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();

	}
	
	

}
