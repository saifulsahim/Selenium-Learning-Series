package CH_14_Java_Streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSorting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");	
		
		// Click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		// capture all webelement into list
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		//  capture text of all webelement into new list
		List<String> originalList =elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		// sort in the list of step 3 -> sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedList));
		
		
		
		

	}

}
