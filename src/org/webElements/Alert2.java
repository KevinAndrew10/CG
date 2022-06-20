package org.webElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manik\\workspace\\Selanium\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement wizets = driver.findElement(By.xpath("(//div[@class='header-text'])[2]"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)",wizets);
		WebElement element = driver.findElement(By.id("promtButton"));
		element.click();
	    Alert alert = driver.switchTo().alert();
	    Thread.sleep(2000);
        alert.sendKeys("kevin");
        Thread.sleep(4000);
		alert.accept();

	}

}
