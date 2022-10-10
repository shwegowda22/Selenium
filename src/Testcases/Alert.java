package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(5000);
		//click on Ok in alert
		driver.switchTo().alert().accept();
		//click on Cancel in alert
		//driver.switchTo().alert().dismiss();
	}

}
