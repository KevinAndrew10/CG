package org.webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class WebTable {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\manik\\workspace\\Selanium\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();

		WebElement body = driver.findElement(By.tagName("tbody"));
		List<WebElement> rows = body.findElements(By.tagName("tr"));
		for (int i=0;i<rows.size();i++) 
		{ 
		    String REC1=null;
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			String companyName = columns.get(0).getText();
			Thread.sleep(2000);
			if(companyName.contains("REC")){
				REC1=companyName;
				String price = columns.get(3).getText();
				System.out.println(price);
			}if(REC1==null){
				System.out.println("NCC is not there");
			}
			
			
			

		}
		driver.quit();
	}


}


