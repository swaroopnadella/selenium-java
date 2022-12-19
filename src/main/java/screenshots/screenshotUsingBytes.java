package screenshots;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotUsingBytes {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://dzone.com/testing-tools-and-frameworks");
		
		byte[] source = driver.getScreenshotAs(OutputType.BYTES);
		IOUtils.write(source, new FileOutputStream("src/main/java/screenshots/usingBytes.png"));
		driver.quit();
	}
}