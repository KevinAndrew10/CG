package org.webElements;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manik\\workspace\\Selanium\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("a077aa5e");
		WebElement down = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",down);
		driver.switchTo().parentFrame();
		WebElement email = driver.findElement(By.id("philadelphia-field-email"));
		email.sendKeys("kevinaarosh2425");
		WebElement submit = driver.findElement(By.id("philadelphia-field-submit"));
		submit.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	    
		List<WebElement> iterate = driver.findElements(By.tagName("iframe"));
		for(int i=0;i<iterate.size();i++)
		{
		WebElement value = iterate.get(i);
		String text = value.getText();
		System.out.println(text);
		}
		
		
		
		
		
		

	}

}
