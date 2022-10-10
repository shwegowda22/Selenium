package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		driver.manage().window().maximize();
		 
		    System.out.println("Switching to first iFrame has started");
	        driver.switchTo().frame("iframeResult");
	        System.out.println("Switching to first iFrame has ended");
	 
	        System.out.println("Switching to second iFrame has started");
	        driver.switchTo().frame(driver.findElement(By.xpath("//*[@title='W3Schools Free Online Web Tutorials']")));
	        System.out.println("Switching to second iFrame has ended");
	 
	 
	        WebElement login = driver.findElement(By.id("w3loginbtn"));
	        System.out.println("Clicking login button has started");
	        login.click();
	        System.out.println("Clicking login button has ended");
	        driver.close();

	}

}
