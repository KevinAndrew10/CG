package org.webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsJavaScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manik\\workspace\\Selanium\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		WebElement close = driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]"));
		close.click();
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("iphone 11");
WebElement clickicon = driver.findElement(By.xpath("//button[@type='submit']"));
clickicon.click();
Thread.sleep(5000);
List<WebElement> iphone11 = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 11 (Purple, 128 GB)')]"));
for(int i=0;i<iphone11.size();i++){
	WebElement lists = iphone11.get(i);
	String text = lists.getText();
	System.out.println(text);
}
		
		
		
		
		
		
		}
}
