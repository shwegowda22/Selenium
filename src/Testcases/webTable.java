package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		int rows = driver.findElements(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody/tr")).size();
		System.out.println(rows);
		
		int columns = driver.findElements(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody/tr/th")).size();
		System.out.println(columns);
		
		for (int i=2;i<=rows;i++)
		{
			for(int j=1;j<=columns;j++)
			{
				System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody/tr["+i+"]/td["+j+"]")).getText());
			}
			System.out.println();
		}
	}

}
