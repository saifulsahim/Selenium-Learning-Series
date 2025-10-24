package CH_05_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class differentLocators {

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
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear(); // customized xpath using index
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("jhondoe@email.com"); // customized css using index

		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("5515151515"); // Generating xpaths with parent to child tags traverse
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click(); // traverse from parent to child
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("test"); // using id made cssSelector #id i.e #inputUsername
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); // using regular expression by cssSelector
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click(); // using regular expression by xpath
		 
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
	Tagname[attribute=’value’]:nth-child(index)
	Parenttagname childtagname // travering parent to child tag
	In customized cssSelector regular expression is very easy just use * i.e ->input[type*='pass']

	In customized cssSelector or xpath , you have to give full class name

  Xpath –

		//Tagname[@attribute=’value’]
  	    //input[@placeholder=’ Username’]
  		//Tagname[@attribute=’value’][index]
  		//parentTagname/childTagname // travering parent to child tag
  		In customized xpath regular expression is tricky -> 
  				//button[@class='submit signInBtn'] it is xpath 
  				//button[contains(@class,'submit')]
  				 

	
*/

