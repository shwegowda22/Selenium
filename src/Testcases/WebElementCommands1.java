package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands1 {

	public static void main(String[] args) throws InterruptedException {
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Test@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).clear();
		
		driver.findElement(By.linkText("SIGN-ON")).click();
		
		var text= driver.findElement(By.xpath("//font[contains(text(),'to Las Vegas')]")).getText();
		System.out.println(text);
		
		var show = driver.findElement(By.name("submit")).isDisplayed();
		System.out.println(show);
		var show1 = driver.findElement(By.name("submit")).isEnabled();
		System.out.println(show1);
		var show2 = driver.findElement(By.name("submit")).isSelected();
		System.out.println(show2);
		
		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("hello");
		var attr=driver.findElement(By.name("password")).getAttribute("name");
		System.out.println(attr);
		var size=driver.findElement(By.name("password")).getSize();
		System.out.println(size);
		var tag=driver.findElement(By.name("password")).getTagName();
		System.out.println(tag);
		var title=driver.getTitle();
		System.out.println(title);
		

	}

}
