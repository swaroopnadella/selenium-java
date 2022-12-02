package launchBrowsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlessChrome {
	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("headless");
		//co.addArguments("--headless");
		co.setHeadless(true);
		ChromeDriver driver = new ChromeDriver(co);
		driver.navigate().to("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		System.out.println("after driver quit method");
	}
}
