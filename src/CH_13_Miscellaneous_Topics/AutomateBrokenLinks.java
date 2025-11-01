package CH_13_Miscellaneous_Topics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateBrokenLinks {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Broken URL
		// Step 1 : Get all urls tied up to the links
		// Java method will call URL's and gets the status code
		// If status code >  400 i.e url is not working
		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href"); // using regular expression
		
		URI uri = URI.create(url);                    // String → URI
		HttpURLConnection conn = (HttpURLConnection) uri.toURL().openConnection();  // URI → URL → Conn
		//HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode = conn.getResponseCode();
		System.out.println(respCode);
		
	} 

}
