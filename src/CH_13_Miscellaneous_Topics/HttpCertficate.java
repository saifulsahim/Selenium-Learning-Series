package CH_13_Miscellaneous_Topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HttpCertficate {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true); // accept insecure certificate
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
