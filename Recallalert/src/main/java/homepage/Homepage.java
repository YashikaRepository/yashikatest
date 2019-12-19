package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Homepage {
	WebDriver driver;
	
    @Test


    public void homepage() {


System.setProperty("webdriver.gecko.driver", "C:\\drive\\geckodriver.exe");

//WebDriver driver = new ChromeDriver();
WebDriver driver = new FirefoxDriver();


driver.get("http://ec2-15-206-63-201.ap-south-1.compute.amazonaws.com/");


   //  /html/body/div[2]/div[2]/div/div[1]/a[1]


         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/a[1]")).click();








	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



		
	}}
