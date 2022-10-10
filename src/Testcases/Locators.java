package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		        //Open Chrome browser
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium_webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
		        //Open URL
				driver.get("http://automationpractice.com/index.php");
				driver.manage().window().maximize();

				//finding element by ID
				driver.findElement(By.id("search_query_top")).sendKeys("Tshirts");
				
				//finding element by name
				driver.findElement(By.name("submit_search")).click();
				
				//finding element by link text
				driver.findElement(By.linkText("Printed Chiffon Dress")).click();
				
				//find element by className
				int sliders=driver.findElements(By.className("homeslider-container")).size();
				System.out.println(sliders);
				
				//find element by tagName
				var links =driver.findElements(By.tagName("a")).size();
				System.out.println(links);			
	}

}
