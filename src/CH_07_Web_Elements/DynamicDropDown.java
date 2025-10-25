package CH_07_Web_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 //a[@value='MAA'] - Xpath for chennai
		 //a[@value='BLR'] - Bengaluru
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click(); // Index 2 is used because Selenium counts options from the top (starting at 0), so “Delhi” is the 2nd item in the dropdown "To".
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
		////div[@id='glsctl00_mainContent_ddl_originStation1_CTNR\'] //a[@value='BLR']
		////div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR\'] //a[@value='BLR']




	}

}
