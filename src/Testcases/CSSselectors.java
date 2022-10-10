package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectors {

	public static void main(String[] args) {
		 //Open Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        //Open URL
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		//Tag and ID
		driver.findElement(By.cssSelector("input#email")).sendKeys("shwegowda22@gmail.com");
		
		//Tag and class
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Test@123");
		
		//Tag and attribute
		driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("Test@123");
		
		//Tag,class and attribute
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("Hello");
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("Hello");
	}

}
