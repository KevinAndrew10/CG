package org.webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskGuru {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\manik\\workspace\\Selanium\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		
		WebElement source1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement source2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement source3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		
		WebElement target1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement target2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		WebElement target3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		JavascriptExecutor j =  (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(true)", source);
		
		Actions a=new Actions(driver);
		
		a.dragAndDrop(source1, target1).build().perform();
		
		a.dragAndDrop(source2, target2).build().perform();
		
		a.dragAndDrop(source, target).build().perform();

		a.dragAndDrop(source3, target3).build().perform();
		
		WebElement perfect = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		String text = perfect.getText();
		System.out.println(text);	
		String s1="Perfect!";
		if(text==s1)
		{
			System.out.println("success");
		}else{
			System.out.println("failure");
		}
		}
		
		
	}
		



