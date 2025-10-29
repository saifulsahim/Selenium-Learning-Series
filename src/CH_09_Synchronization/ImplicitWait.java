package CH_09_Synchronization;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		String[] items = { "Cucumber", "Brocolli", "Pumpkin", "Beans" };
		addItems(driver, items);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click(); //clicking cart button
		//driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click(); //another xpath 
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy"); // promo code giving
		driver.findElement(By.cssSelector(".promoBtn")).click(); // clicking apply button
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());

	}
	public static void addItems(WebDriver driver, String[] items) {
		List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));
		int j = 0;
		int i = 0;
		while (i < products.size()) {
			// Brocolli - 1 kg
			String[] name = products.get(i).getText().split("-");
			// name[0] -> Brocolli
			String formattedName = name[0].trim();
			// check whether name you extracted is present in arrayList or not-
			// convert array into array list for easy search
			List itemsList = Arrays.asList(items);

			if (itemsList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == items.length) {
					break;
				}
			}
			i++;
		}
	}

}

// pros -> Readable code
// cons -> hide performance issue
