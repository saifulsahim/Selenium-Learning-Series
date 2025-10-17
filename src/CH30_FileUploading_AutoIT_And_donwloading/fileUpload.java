package CH30_FileUploading_AutoIT_And_donwloading;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://smallpdf.com/jpg-to-pdf");
		 driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		 driver.findElement(By.id("pickfiles")).click(); //choose button click
		 Thread.sleep(3000);
		 Runtime.getRuntime().exec("F:\\Selenium\\FileUpload.exe");
		 
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("processTask"))); //wait to appear convert button
		 driver.findElement(By.id("processTask")).click(); //clicking convert button
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pickfiles"))); // wait to appear download button
		 driver.findElement(By.id("pickfiles")).click(); //clicking download button

		 
		//Shift focus to the file upload windows
		//set text/path into file name edit box
		//click open to upload file
		 
		/*
		 * Au3info- record window component objects
		 * 
		 * Build Script -scite.exe
		 * 
		 * Save it- .au3 extenstion
		 * 
		 * Convert file into .exe by compiling .au3 file
		 * 
		 * Call .exe file with Runtime class in java into your selenium tests
		 * 
		 * 
		 * 
		 * ControlFocus("Open","","Edit1")
		 * 
		 * ControlSetText("Open","","Edit1","C:\Users\saifu\Downloads\CertificateOfCompletion_Software Testing Tools.pdf")
		 * 
		 * ControlClick("Open","","Button1")
		 */
		 

	}

}
 