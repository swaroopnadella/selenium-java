package launchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTesting {
	public static void main(String[] args) {
		String browser = "Edge";
		WebDriver driver;
		switch(browser.toUpperCase()) {
		case "EDGE":
			driver = new EdgeDriver();
			break;
		case "FIREFOX":
			driver = new FirefoxDriver();
			break;
		case "SAFARI":
			driver = new SafariDriver();
			break;
		case "IEDRIVER":
			driver = new InternetExplorerDriver();
			break;
		default:
			driver = new ChromeDriver();
		}	
		driver.navigate().to("https://www.youtube.com/@swaroopnadella");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}