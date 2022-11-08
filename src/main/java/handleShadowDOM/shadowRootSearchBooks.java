package handleShadowDOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class shadowRootSearchBooks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://books-pwakit.appspot.com/");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		WebElement pageTitle = (WebElement) jse.executeScript(
				"return document.querySelector(\"body > book-app\").shadowRoot.querySelector(\"app-header > app-toolbar.toolbar-top > div > a\")");
		System.out.println(pageTitle.getText());
		
		WebElement search = (WebElement) jse.executeScript(
				"return document.querySelector(\"body > book-app\").shadowRoot.querySelector(\"#input\")");
		search.sendKeys("Test Automation");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		WebElement firstSearchResultText = (WebElement) jse.executeScript(
				"return document.querySelector(\"body > book-app\").shadowRoot.querySelector(\"main > book-explore\").shadowRoot.querySelector(\"section > ul > li:nth-child(1) > book-item\").shadowRoot.querySelector(\"a > div.info > div > div.title-container > h2\")");
		System.out.println(firstSearchResultText.getText());
		

		driver.quit();
	}

}
