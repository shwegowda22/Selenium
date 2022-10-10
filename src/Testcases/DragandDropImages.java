package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropImages {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));
		
		WebElement target= driver.findElement(By.xpath("//*[@id=\"trash\"]"));
		WebElement dargItem= driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
		 Actions act = new Actions(driver);
		 act.dragAndDrop(dargItem, target).perform();
		
		

		

	}

}
