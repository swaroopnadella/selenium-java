package launchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class launchHtmlUnitDriver {
	public static void main(String[] args) {
		WebDriver driver = new HtmlUnitDriver();
		//HtmlUnitDriver driver=new HtmlUnitDriver(); 
		//We can also create driver object using HtmlUnitDriver
		driver.navigate().to("https://seleniumconf.com/");
		System.out.println("Page Title: "+driver.getTitle());
		driver.quit();
		System.out.println("after driver quit method");
	}
}