package org.webElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFrameWindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\manik\\workspace\\Selanium\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();

		WebElement customerid = driver.findElement(By.name("cusid"));
		customerid.sendKeys("98765");
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		Alert alert1 = driver.switchTo().alert();
		String text1 = alert1.getText();
		System.out.println(text1);
		alert1.accept();		

		Alert alert2 = driver.switchTo().alert();
		String text2 = alert2.getText();
		System.out.println(text2);
		alert2.accept();














	}

}
