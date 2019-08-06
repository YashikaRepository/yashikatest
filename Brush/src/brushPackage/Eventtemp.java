package brushPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Eventtemp {

	private static final TimeUnit SECONDS = null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\drive\\geckodriver.exe");
		
		//WebDriver driver = new ChromeDriver();
WebDriver driver = new FirefoxDriver();
		driver.get("http://34.209.253.65/cpanel");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/input[1]")).sendKeys("bb@boardandbrush.com");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/input[2]")).sendKeys("123456");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/input[3]")).click();
	
		driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]/a")).click();
		
		driver.findElement(By.linkText("Add Event Template")).click();
		driver.findElement(By.xpath("//*[@id=\"evTempName\"]")).sendKeys("Template Selenium Test");
		driver.findElement(By.xpath("//*[@id=\"evTempTitle\"]")).sendKeys("selenium title");
		//*[@id="evTempTitle"]
		
		
		//*[@id="evTempDescription"]
		
		
		driver.findElement(By.xpath("//*[@id=\"evTempDescription\"]")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		
		
		driver.findElement(By.xpath("//*[@id=\"evCalColor\"]")).sendKeys("/html/body/div[4]/div/form/div[3]/div[1]/div[4]/select/option[2]");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//*[@id="evCalColor"]
		
		
		//*[@id="evCalLabel"]
		driver.findElement(By.xpath("//*[@id=\"evCalLabel\"]")).sendKeys("selenium test label");
		//*[@id="evScheduleHrs"]
		
		driver.findElement(By.xpath("//*[@id=\"evScheduleHrs\"]")).sendKeys("1");
		
		
		//*[@id="evNoOfTickets"]
		driver.findElement(By.xpath("//*[@id=\"evNoOfTickets\"]")).sendKeys("12");
		
		//*[@id="evTicketName1"]
		driver.findElement(By.xpath("//*[@id=\"evTicketName1\"]")).sendKeys("selenium package");
		
		//*[@id="evTicketButtonLabel1"]
		driver.findElement(By.xpath("//*[@id=\"evTicketButtonLabel1\"]")).sendKeys("Bring a friend");
		//*[@id="lstPProjectOptions1"]
		
		
		driver.findElement(By.xpath("//*[@id=\"lstPProjectOptions1\"]")).sendKeys("/html/body/div[4]/div/form/div[5]/div[2]/div/div[2]/div[3]/div/div/div[2]/div/select/option[2]");
		
		//driver.manage().timeouts().pageLoadTimeout(13,SECONDS);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//*[@id="btnSave"]
		
		
		
		
		
		
		
		
		
		
		

	}

}
