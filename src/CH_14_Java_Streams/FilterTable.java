package CH_14_Java_Streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");	
		
	    driver.findElement(By.id("search-field")).sendKeys("Rice");
	    // after entering rice, only rice will show
        List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));
        //1 result
        // After applying stream only rice item show
        List<WebElement> filteredList= veggies.stream().filter(veggie->veggie.getText().contains("Rice")).collect(Collectors.toList());
        //1 result
        Assert.assertEquals(veggies.size(), filteredList.size());



	}

}
