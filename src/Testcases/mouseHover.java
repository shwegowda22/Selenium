package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
        WebElement desktopHover= driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/a"));
        WebElement mouseHover = driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/div/div/ul/li[2]/a"));
        Actions act = new Actions(driver);
		 act.moveToElement(desktopHover).moveToElement(mouseHover).click().perform();
	}

}
