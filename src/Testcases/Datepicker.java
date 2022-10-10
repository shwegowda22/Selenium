package Testcases;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		String year ="2022";
		String Month="Dec";
		String Date="6";
		
		driver.findElement(By.id("onward_cal")).click();
		while (true)
		{
			String Monthyear = driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText();
			//System.out.println(Monthyear);
			String arr[]=Monthyear.split(" ");
			String mon= arr[0];
			String year1 = arr[1];
			if(mon.equalsIgnoreCase(Month) && year1.equalsIgnoreCase(year))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]")).click();
			}
		}
		List<WebElement> alldates= driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table[1]/tbody/tr/td"));
		for (WebElement ele:alldates)
		{
			String dt= ele.getText();
			System.out.println(dt);
			if (dt.equals(Date)) {
				ele.click();
				break;
			}					
		}
		
		

	}
	

}
