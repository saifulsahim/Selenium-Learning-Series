package CH_07_Web_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		// Select from,to,current date, 5 adults, clicking senior citizenship, then click search
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click(); //selecting radio button one way first
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click(); 
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click(); // clicking current date of calendar

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("Disabled");
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click(); //using regular expression clicking checkbox
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i = 1;
		while (i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click(); 
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		//driver.findElement(By.cssSelector("input[value='Search']")).click(); // using customized css

		// driver.findElement(By.xpath("//input[@value='Search']")).click(); // using customized xpath

	}

}
