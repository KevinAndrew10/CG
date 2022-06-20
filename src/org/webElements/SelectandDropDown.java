package org.webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectandDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\manik\\workspace\\Selanium\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement create = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
		create.click();
		Thread.sleep(2000);
//		WebElement day = driver.findElement(By.id("day"));
//		Select s=new Select(day);
//		s.selectByValue("3");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1=new Select(month);
		//s1.selectByIndex(5);
		List<WebElement> month1 = s1.getOptions();
		for (WebElement value : month1) {
			String text = value.getText();
			System.out.println(text);
		}
		
		
		
		
		
		
//		 
//		WebElement year = driver.findElement(By.id("year"));
//		Select s2=new Select(year);
//		s2.selectByVisibleText("1997");
//		
	}

}
