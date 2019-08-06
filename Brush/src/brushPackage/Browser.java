package brushPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("34.209.253.65");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		

	}

}
