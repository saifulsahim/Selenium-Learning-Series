package CH_11_Real_time_exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLinkCounts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size()); // 1.total links count
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); // 2. total links of footer section
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());  // 3. Total 1st column links of footer
		
		// Click on each link in the column and check if the pages are opening
		int i = 1;
		while(i<columnDriver.findElements(By.tagName("a")).size())
		{
			String clickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			i++;
		}
	}

}

/*
 * 	1. List the count of links on the page
 * 	2.  count link of footer section
 *  3. Total 1st column links of footer
 *  4. Click on each link in the column and check if the pages are opening
*/
