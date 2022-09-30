package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");

		// Find the radio button for “No” using its ID and click on it
		driver.findElement(By.id("search_query_top")).sendKeys("Tshirts");
			
		//Click on Check Button
		driver.findElement(By.name("submit_search")).click();
		driver.close();

		}


	}


