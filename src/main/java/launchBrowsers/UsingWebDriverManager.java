package launchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingWebDriverManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//method create() to manage automatically the driver and instantiate the WebDriver object in a single line
		//WebDriver driver = WebDriverManager.chromedriver().create();
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.udemy.com/");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
