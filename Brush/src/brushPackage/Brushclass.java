package brushPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Brushclass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\drive\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getWindowHandle());
		//driver.quit();
		
		
		
		
		
		
		
		

	}

}
