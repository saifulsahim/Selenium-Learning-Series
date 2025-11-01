package CH_13_Miscellaneous_Topics;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HttpCertficate {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		/*
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddess:4444");
		options.setCapability("proxy", proxy);
		*/
		
		/* Set download directory
		 * 
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);
		*/
		
		options.setAcceptInsecureCerts(true); // accept insecure certificate
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
