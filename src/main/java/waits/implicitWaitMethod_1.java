package waits;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWaitMethod_1 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://guru99.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}