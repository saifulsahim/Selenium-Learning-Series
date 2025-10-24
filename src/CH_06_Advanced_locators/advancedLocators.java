package CH_06_Advanced_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class advancedLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		
		String name = "Miqdad";
		String password= getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
 		driver.findElement(By.id("inputUsername")).sendKeys(name);
 		
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click(); 
		
		Thread.sleep(2000); // waiting to load page after login
		//System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+ name +",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		//driver.close();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText(); 
		// Please use temporary password 'rahulshettyacademy' to Login.
		// Oth index - Please use temporary password '
		// 1st index- rahulshettyacademy' to Login.
		String[] passwordArray = passwordText.split("'");
		String password = passwordArray[1].split("'")[0];
		return password;

	}
	
	/*
	 * tagname can only be used if there is only one tag i.e <p> tag
	 * 
	 * so this one again is optional. 
	 * You can give star also Star stands for optional. 
	 * Like if you don't want to give tag name, you can omit it and just put star there. 
	 * Slash slash star. It will still find one element matching not only here, anywhere here. 
	 * If you think that without tag name. Also if that is uniquely identifying, right? 
	 * In CSS you can just get rid of anything. 
	 * But in XPath you have to give like this star. 
	 * Star stands for any. It could be input, span, button, anchor, a, anything. 
	 * Okay, so if you think that doesn't matter, whatever tag name is, if you are only interested in this attribute, then just put star. 
	 * Basically even with star Also if it's uniquely identified then fine. 
	 * But sometimes there could be another HTML with the same logout or but the tag name is input at that time it matters.
	 *  If you exactly want to go with a button tag name thing, then you write this button. Okay? 
	 *  Because both HTMLs in that have same logout text. But in this case there is only one logout text.
	 */

}
