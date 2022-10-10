package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://searchengineland.com/9-examples-link-worthy-resources-e-commerce-sites-239364");
		driver.manage().window().maximize();
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement l :links)
		{
			System.out.println(l.getText());
		}
		
		driver.findElement(By.linkText("About Us")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(3000);

		System.out.println(driver.getTitle());

		driver.findElement(By.linkText("Contact")).click();
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(3000);

		/*driver.navigate().forward();
		Thread.sleep(3000);*/

		System.out.println(driver.getTitle());

		driver.navigate().refresh();
		driver.close();
		

	}

}
