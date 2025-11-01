package CH_13_Miscellaneous_Topics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AutomateBrokenLinks {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li'] a")); // get list of all links
		SoftAssert a = new SoftAssert();
		for(WebElement link: links)
		{
			//String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href"); // using regular expression get one specific link
			String url = link.getAttribute("href"); 
			
			URI uri = URI.create(url);                    // String → URI
			HttpURLConnection conn = (HttpURLConnection) uri.toURL().openConnection();  // URI → URL → Conn
			//HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			
			//System.out.println(link.getText());
			//System.out.println(respCode);
			a.assertTrue(respCode<400, "Link with text " + link.getText() + " is broken with code " + respCode);
//			if(respCode > 400)
//			{
//				System.out.println("Link with text " + link.getText() + " is broken with code" + respCode);
//				Assert.assertTrue(false);
//			}
		}
		a.assertAll(); // without this , failure will catch but not report
		// Broken URL
		// Step 1 : Get all urls tied up to the links
		// Java method will call URL's and gets the status code
		// If status code >  400 i.e url is not working
		
		// Soft assertion is like if one failure is found , it won't stop the execution . After finding all failures , it will stop & report
		
		
	} 

}
