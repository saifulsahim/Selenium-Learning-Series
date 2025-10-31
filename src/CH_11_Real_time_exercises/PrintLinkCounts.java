package CH_11_Real_time_exercises;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLinkCounts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElements(By.tagName("a")).size()); // 1.total links count

		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); // 2. total links of footer section
		System.out.println(footerDriver.findElements(By.tagName("a")).size());

		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size()); // 3. Total 1st column links of footer

		// 4. Click on each link in the column and check if the pages are opening in
		// separate tab
		int i = 1;
		while (i < columnDriver.findElements(By.tagName("a")).size()) {
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000L);
			i++;
		}
		// 5. Get the title of each opening links in separate tab
		Set<String> abc = driver.getWindowHandles(); // 4 windows
		Iterator<String> it = abc.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}

/*
 * 	1. List the count of links on the page
 * 	2.  count link of footer section
 *  3. Total 1st column links of footer
 *  4. Click on each link in the column and check if the pages are opening in separate tab
 *  5. Get the title of each opening links in separate tab
*/
