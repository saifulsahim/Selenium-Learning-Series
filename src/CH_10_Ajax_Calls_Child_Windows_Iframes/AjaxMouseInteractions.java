package CH_10_Ajax_Calls_Child_Windows_Iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AjaxMouseInteractions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.cssSelector("button[alt='Continue shopping']")).click(); // clicking continue shopping
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("div[id='nav-link-accountList']"))).build().perform();
	}

}
