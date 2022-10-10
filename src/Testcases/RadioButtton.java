package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://materializecss.com/radio-buttons.html");
		driver.manage().window().maximize();
	    WebElement radioBtn= driver.findElement(By.xpath("//span[contains(text(),'Yellow')]"));
        
	       
	       System.out.println(radioBtn.isDisplayed());
	       System.out.println(radioBtn.isSelected());
	       System.out.println(radioBtn.isEnabled());
	       radioBtn.click();
	       System.out.println(radioBtn.isDisplayed());
	       System.out.println(radioBtn.isSelected());
	       System.out.println(radioBtn.isEnabled());

	}

}
