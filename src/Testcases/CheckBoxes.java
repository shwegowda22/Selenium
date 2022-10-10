package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		
		  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/blockquote[1]/form[1]/input[2]")).click();
	       driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/blockquote[1]/form[1]/input[5]")).click();


	}

}
