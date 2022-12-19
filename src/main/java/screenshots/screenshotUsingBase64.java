package screenshots;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class screenshotUsingBase64 {
	public static void main(String[] args) throws IOException {
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("https://theqalead.com/test-management/best-software-testing-blogs/");
		
		String source = driver.getScreenshotAs(OutputType.BASE64);
		byte[] decodedScreenshot = Base64.getDecoder().decode(source);
		IOUtils.write(decodedScreenshot, new FileOutputStream("src/main/java/screenshots/usingBase64.png"));
		driver.quit();
	}
}