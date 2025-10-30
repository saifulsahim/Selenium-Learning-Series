package CH_10_Ajax_Calls_Child_Windows_Iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AjaxMouseInteractions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.cssSelector("button[alt='Continue shopping']")).click(); // clicking continue shopping
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("div[id='nav-link-accountList']"));
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello")
		.doubleClick().build().perform(); // double click to select whole text
		//Move to specific element
		a.moveToElement(move).contextClick().build().perform(); // right click on mouse button
	}

}
