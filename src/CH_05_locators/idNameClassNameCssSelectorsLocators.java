package CH_05_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idNameClassNameCssSelectorsLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // globally applicable for each line
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Jhon");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jhon@email.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("jhondoe@email.com");

	}	
}

/*
ID
Xpath
CSS Selector
name
Class Name
Tag Name
Link Text
Partial Link Text


implicit wait -> globally
  CssSelector -> 
	className -> tagname.classname ->   Button.signInBtn -> .error-> here Tagname is optional
	Id -> tagname#id      -> Example  input#inputUsername
	Tagname[attribute=’value’]
	<input type="text" placeholder="Username” value=" "> -> example ->Input [placeholder=’ Username’]

  Xpath –

	//Tagname[@attribute=’value’]
  	   //input[@placeholder=’ Username’]
  		//Tagname[@attribute=’value’][index]
  	 
	
*/

