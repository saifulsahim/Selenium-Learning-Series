package CH_30_FileUploading_AutoIT_And_donwloading;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class fileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		String downloadPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);

		WebDriver driver = new ChromeDriver(options);
		// driver.get("https://smallpdf.com/jpg-to-pdf");
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		driver.findElement(By.id("pickfiles")).click(); // choose button click
		Thread.sleep(3000);
		Runtime.getRuntime().exec("F:\\Selenium\\FileUpload.exe");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("processTask"))); // wait to appear convert
																							// button
		driver.findElement(By.id("processTask")).click(); // clicking convert button

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pickfiles"))); // wait to appear download button
		driver.findElement(By.id("pickfiles")).click(); // clicking download button
		Thread.sleep(5000);
		File f = new File(downloadPath + "/CertificateOfCompletion_Software Testing Tools_page-0001.jpg");
		System.out.println("sdsds" + f);
		if (f.exists()) {
			Assert.assertTrue(f.exists());
			if(f.delete()) {
				System.out.println("File deleted");
			}
		}

		// Shift focus to the file upload windows
		// set text/path into file name edit box
		// click open to upload file

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
		 * ControlSetText("Open","",
		 * "Edit1","C:\Users\saifu\Downloads\CertificateOfCompletion_Software Testing Tools.pdf"
		 * )
		 * 
		 * ControlClick("Open","","Button1")
		 */

	}

}
