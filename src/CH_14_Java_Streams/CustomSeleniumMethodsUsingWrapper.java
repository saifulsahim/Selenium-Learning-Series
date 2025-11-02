package CH_14_Java_Streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CustomSeleniumMethodsUsingWrapper {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");	
		
		// Click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		// capture all webelement into list
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		
		// Scan the name column with getText- > Rice -> print price of rice
		List<String> price = elementsList.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
		price.forEach(s->System.out.println(s));
	}

	private static String getPriceVeggie(WebElement s) {
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
