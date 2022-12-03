package launchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;

public class launchChromeDriverWithWebDriver {

	public static void main(String[] args) {
		WebDriver driver1; //just added to add the import statement for WebDriver
		//ChromeDriver driver = new WebDriver();
		// uncomment above line to get compile time error "Cannot instantiate the type WebDriver"
		// 1.Using child class instance we cannot access the parent And
		// 2.WebDriver is an Interface so not possible to call constructor or create object

		// add the import statement for WebDriver manually otherwise we get error as "WebDriver cannot be resolved to a type"
		// as WebDriver do not have a constructor since it is an Interface
		// import org.openqa.selenium.WebDriver;
	}
}
