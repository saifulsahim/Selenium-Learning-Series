package CH_08_Ecommerce;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditemsToCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		String[] items = { "Cucumber", "Brocolli", "Pumpkin", "Beans"};
		int j =0;
		List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));

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
				if(j==items.length) {
					break;
				}
			}
			i++;
		}

	}

}
