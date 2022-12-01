package launchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class crossBrowserTesting {
	public static void main(String[] args) {
		String browser = "Firefox";
		WebDriver driver;
		switch(browser) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		case "Firefox":
			driver = new FirefoxDriver();
			break;
		case "Safari":
			driver = new SafariDriver();
			break;
		case "IEDriver":
			driver = new InternetExplorerDriver();
			break;
		default:
			driver = new ChromeDriver();
		}	
		driver.navigate().to("https://www.udemy.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}