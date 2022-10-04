package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFunctions {

	public static void main(String[] args) {
		//Open Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		//Open URL
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		//OR
		driver.findElement(By.xpath("//input[@id='search_query_top' or @name='search_query']")).sendKeys("Dresses");
		
		//AND
		driver.findElement(By.xpath("//button[@class='btn btn-default button-search' and @name='submit_search']")).click();
		
		//contains
		driver.findElement(By.xpath("//button[contains(@name,'submit')]")).click();
		
		//startswith
		driver.findElement(By.xpath("//input[starts-with(@name,'search_')]")).sendKeys("Dresses");
		
		//text
		driver.findElement(By.xpath("//a[text()='T-shirts']")).click();
		
		//chained xpath
		driver.findElement(By.xpath("//form[@id='searchbox']//input[@id='search_query_top']")).sendKeys("Women");
		
		

	}

}
