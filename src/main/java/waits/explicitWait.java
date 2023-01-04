package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		WebElement ele = driver.findElement(By.id("test"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("table")));
		
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(ele)));
		try{
		     driver.findElement(By.xpath("xpath here")).click();
		  }
		  catch(StaleElementReferenceException e){
		     System.out.println(e.getMessage());
		  }

	}

}
