package inspector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ManagePropert {
	
	@Test
	
	
public void login() throws InterruptedException {
		
		
		
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\drive\\geckodriver.exe");
			
			//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();


			driver.get("http://ec2-15-206-63-201.ap-south-1.compute.amazonaws.com/inspector-login");
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Mark");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345678");
			
			driver.findElement(By.xpath("//html/body/div[3]/div/div/div[2]/div[2]/form/div[3]/input")).click();
			
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
			
			
			///html/body/div[2]/div/div/div[2]/ul/li[4]/a  > Click on Manage property
			
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul/li[4]/a")).click();
			
			
			////*[@id="first"] Enter Customer First Name
			
			driver.findElement(By.xpath("//*[@id=\"first\"]")).sendKeys("Rose");
			
			////*[@id="last"] Enter Customer last name
			driver.findElement(By.xpath("//*[@id=\"last\"]")).sendKeys("Depp");
			
			////*[@id="address1"] Enter Customer address1
			
			driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("#453");
			
			////*[@id="address2"] Add Address2
			
			driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("2nd Floor");
			
			
			
			////*[@id="city"] Enter Customer City
			
			driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("San Diego");
			
			
			////*[@id="state"] Enter Customer State
			
			driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("California");
			
			////*[@id="zip"] Enter zip code
			
			driver.findElement(By.xpath("//*[@id=\"zip\"]")).sendKeys("45321");
			
			
			////*[@id="email"] Enter Customer Email
			
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Yashikapatodia27@icloud.com");
			
			////*[@id="mobilephone"] Customer Mobile phone
			
			
			driver.findElement(By.xpath("//*[@id=\"mobilephone\"]")).sendKeys("9898989898");
			
			
			////*[@id="realtor_mail"] Enter Realtor Email address
			
			
			
			driver.findElement(By.xpath("//*[@id=\"realtor_mail\"]")).sendKeys("saini.yashika3@gmail.com");
			
			
			////*[@id="inspection_date"] Enter the date first clear field
			
			//driver.findElement(By.xpath("//*[@id=\"inspection_date\"]")).sendKeys("12/31/2019");
			
			driver.findElement(By.xpath("//*[@id=\"inspection_date\"]")).clear();
			
			
			///html/body/div[6]/table/tbody/tr[5]/td[3]/a select date
			
			driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[5]/td[3]/a")).click();
			
			
			////*[@id="inspection_time"] Enter Time
			
			
			driver.findElement(By.xpath("//*[@id=\"inspection_time\"]")).sendKeys("4:50 PM");
			
			
			///html/body/div[5]/div/div[3]/a set time by clicking on it
			
			
			//driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div[1]/a/span")).click();
			
			
			///html/body/div[2]/div/div/div[5]/div/form/div[2]/div[6]/div upload houseimage
			
			// click to unuse element just to click out from time pattern
			
			driver.findElement(By.xpath("//html/body/div[2]/div/div/div[5]/div/form/div[2]/div[5]/label[1]")).click();
			
			
			
			////*[@id="housephoto"] upload house image
			////*[@id="housephoto"]
			
			
			WebElement uploadElement = driver.findElement(By.xpath("//*[@id=\"housephoto\"]"));

	        // enter the file path onto the file-selection input field OHH MY MY ITS WORKING
			
			
	        uploadElement.sendKeys("C:\\Users\\ADMINGR-7U78G74\\Downloads\\home.jpg");
	        
	        
	        ////*[@id="btn1"]  UPLOAD APPLIANCE IMAGE BUT FIRST CLICK THE FILE BUTTON
	        
	        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	        
	        
	        driver.findElement(By.xpath("//*[@id=\"btn1\"]")).click();
	        
	        
	        
	        ////*[@id="uploadImage"]  UPLOAD IMAGE FOR APPLIANCE
	        
	        WebElement uploadElement1 = driver.findElement(By.xpath("//*[@id=\"uploadImage\"]"));

	        // enter the file path onto the file-selection input field OHH MY MY ITS WORKING
			
			
	        uploadElement1.sendKeys("C:\\Users\\ADMINGR-7U78G74\\Downloads\\20190830_100342.jpg");
	        //driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	        
	        
	        
	        
	        
	        ///html/body/div[2]/div/div/div[6]/div/div/div[2]/div[3]/ul Enter Appliance name
	        
	        
	        //driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div[3]/ul")).sendKeys("applian1");
	        
	        ///html/body/div[2]/div/div/div[6]/div/div/div[2]/div[4]/ul Appliance Make
	        
	       // driver.findElement(By.xpath("//html/body/div[2]/div/div/div[6]/div/div/div[2]/div[4]")).sendKeys("aSpecialmake");
	        
	        
	        ////*[@id="addappliances"]   Click on submit button
	        
	        Thread.sleep(1000);
	        
	        driver.findElement(By.xpath("//html/body/div[2]/div/div/div[6]/div/div/div[3]")).click();
	        
	        
	       
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
			
			
			
	        
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
			
			
			
			
			
			
			
			
			
			
			
			
			
	
}
	
	
	
	

}
