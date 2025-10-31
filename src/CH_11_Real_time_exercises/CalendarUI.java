package CH_11_Real_time_exercises;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUI {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		// Dec 14 
		driver.findElement(By.id("form-field-travel_comp_date")).click(); // clicking calendar
		
		
		while(!driver.findElement(By.cssSelector(".flatpickr-month")).getText().contains("June")) // found January while loop won't execute that's why set negation to go inside loop until April month is found 
		{
			 driver.findElement(By.cssSelector(".flatpickr-next-month")).click();
		}
		//List<WebElement> dates= driver.findElements(By.className("flatpickr-day"));
		int count = driver.findElements(By.className("flatpickr-day")).size();
		for(int i=0; i< count; i++)
		{
			String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
			if(text.equalsIgnoreCase("20"))
			{
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				break;
			}
		}
		
  
	}

}
