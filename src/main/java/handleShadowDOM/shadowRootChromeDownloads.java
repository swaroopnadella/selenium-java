package handleShadowDOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class shadowRootChromeDownloads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("chrome://downloads/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement search = (WebElement) jse.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-toolbar#toolbar').shadowRoot.querySelector('cr-toolbar#toolbar').shadowRoot.querySelector('cr-toolbar-search-field#search').shadowRoot.querySelector('div#searchTerm > input#searchInput')");
		
		String js = "arguments[0].setAttribute('value','SwaroopNadella')";
		((JavascriptExecutor)driver).executeScript(js, search);
		
		driver.quit();
	}

}
