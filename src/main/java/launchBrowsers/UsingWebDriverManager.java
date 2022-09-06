package launchBrowsers;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingWebDriverManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		//WebDriverdriver = new ChromeDriver();
		//method create() to manage automatically the driver and instantiate the WebDriver object in a single line
		WebDriver driver = WebDriverManager.chromedriver().create();
		
		driver.navigate().to("https://www.udemy.com/");
		
		System.out.println(driver.getTitle());
	}

}
