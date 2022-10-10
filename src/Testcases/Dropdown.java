package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		WebElement dropDown= driver.findElement(By.xpath("//*[@id=\"field26\"]/div/select"));
		Select dropdown = new Select(dropDown);
		System.out.println(dropdown.getOptions().size());
		List <WebElement> options= dropdown.getOptions();
		for (WebElement e: options)
		{
			System.out.println(e.getText());
		}
		//dropdown.selectByVisibleText("251 - 500 employees");
       // dropdown.selectByIndex(3);
        dropdown.selectByValue("level4");
	}

}
