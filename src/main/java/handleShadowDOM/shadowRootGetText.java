package handleShadowDOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class shadowRootGetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://shop.polymer-project.org/");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement shopHome = (WebElement)  jse.executeScript(
				"return document.querySelector(\"body > shop-app\").shadowRoot.querySelector(\"#header > app-toolbar > div.logo > a\")");
		String text = shopHome.getText();
		System.out.println(text);
		String aria_label_text = shopHome.getAttribute("aria-label");
		System.out.println(aria_label_text);
		
		driver.close();
	}

}
