package launchBrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class headlessFirefox {
	public static void main(String[] args) {
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		//fo.setHeadless(true);
		FirefoxDriver driver = new FirefoxDriver(fo);
		driver.navigate().to("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		System.out.println("after driver quit method");
	}
}