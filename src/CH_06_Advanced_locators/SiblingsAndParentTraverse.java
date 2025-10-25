package CH_06_Advanced_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingsAndParentTraverse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//header/div/button[1]/following-sibling::button[1] 
		driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
	}

}
// Absolute xpath -> means only one slash / -> means starting from root
// relative xpath-> starting from somewhere i.e double slash //

