package CH30_FileUploading_AutoIT_And_donwloading;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://smallpdf.com/jpg-to-pdf");
		 driver.findElement(By.cssSelector(".dNifye")).click();
		 Thread.sleep(3000);
		 Runtime.getRuntime().exec("F:\\Selenium\\FileUpload.exe");

		 
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
 