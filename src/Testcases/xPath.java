package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath {

	public static void main(String[] args) {
		//Open Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        //Open URL
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		//Absolute xpath
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]")).sendKeys("Tshirts");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
		
		//Relative xpath
		driver.findElement(By.xpath("//a[contains(text(),'Printed Chiffon Dress')]")).click();
		driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[3]/div[1]/p[1]/button[1]")).click();
	}

}
