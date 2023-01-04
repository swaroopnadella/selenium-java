package waits;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class implicitWaitMethod_2 {
	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.setImplicitWaitTimeout(Duration.ofSeconds(10));
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://dzone.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}