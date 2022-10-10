package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePagination {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination/");
		driver.manage().window().maximize();
		
		WebElement page_element=driver.findElement(By.xpath("//*[@id=\"dtBasicExample_paginate\"]"));
		List <WebElement> sub_links=page_element.findElements(By.tagName("a"));
		System.out.println(sub_links.size());
		if(sub_links.size()>0)
		{
			System.out.println("Links are present");
			for (int i=1;i<sub_links.size()-1;i++)
			{
				WebElement link=driver.findElement(By.xpath("//a[contains(text(),'"+i+"')]"));
				if (i==5)
				{
					var newlink=driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[3]/div[2]/div[1]/ul[1]/li[6]/a[1]"));
					
					newlink.click();
				}
				else {
					link.click();	
				}
				int rows= driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr")).size();
				System.out.println(rows);
				for (int r=1;r<=rows;r++)
				{
					String col1=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr['"+r+"']/td[1]")).getText();
					String col2=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr['"+r+"']/td[2]")).getText();
					String col3=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr['"+r+"']/td[3]")).getText();
					String col4=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr['"+r+"']/td[4]")).getText();
					String col5=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr['"+r+"']/td[5]")).getText();
					String col6=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr['"+r+"']/td[6]")).getText();
					
					System.out.println(col1+" "+col2+" "+col3+" "+col4+" "+col5+" "+col6);
				}
			}
		}
		else {
			System.out.println("Links are not present");
		}
	}

}
