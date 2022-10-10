package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestScript {

	public static void main(String[] args) {
		//Open chrome browser
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium_webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		
		//Open firefox browser
		System.setProperty("webdriver.edge.driver", "C:\\Selenium_webdriver\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
        //Open URL
		driver.get("http://automationpractice.com/index.php");
		
		//close browser
		driver.close();

		}


	}


