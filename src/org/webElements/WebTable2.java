package org.webElements;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {
	static String NCC=null;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manik\\workspace\\Selanium\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		WebElement body = driver.findElement(By.tagName("tbody"));
		List<WebElement> row = body.findElements(By.tagName("tr"));
		for(int i=0;i<row.size();i++)
		{
			
			List<WebElement> column = row.get(i).findElements(By.tagName("td"));
			String companyname = column.get(0).getText();
			if(companyname.contains("NCC"))
			{
		   NCC=companyname;
			String price = column.get(3).getText();
			System.out.println(price);
			
			
				
			}
				
			}
		if(NCC==null){
			System.out.println("NCC is not there");	
		}
		Thread.sleep(2000);
		TakesScreenshot t=(TakesScreenshot)driver;
		File source = t.getScreenshotAs(OutputType.FILE);
       File dest=new File(".//ludo//report1.png");
        FileUtils.copyFile(source, dest);
	}

}
