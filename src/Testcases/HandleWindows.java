package Testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();

		String handlevalue = driver.getWindowHandle();
		System.out.println(handlevalue);
		
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();
		
		Set <String> handlevalues=driver.getWindowHandles();
		for(String h:handlevalues)
		{
			System.out.println(h);
			System.out.println(driver.switchTo().window(h).getTitle());
			if (driver.switchTo().window(h).getTitle().equals("Selenium"))
					{
				//driver.close();
				driver.findElement(By.xpath("//body/div[1]/main[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]")).click();
					}
		}
	}

}
