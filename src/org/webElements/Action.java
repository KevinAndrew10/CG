package org.webElements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manik\\workspace\\Selanium\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement username = driver.findElement(By.name("email"));
		a.sendKeys(username, "kevin").build().perform();
		WebElement password = driver.findElement(By.name("pass"));
        a.sendKeys(password, "98765").build().perform();
        //WebElement forgot = driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
        //a.click(forgot).build().perform();
        //driver.navigate().back();
        WebElement mouse = driver.findElement(By.xpath("//h2[contains(@class,'_8eso')]"));
        a.moveToElement(mouse).build().perform();
        a.doubleClick(mouse).build().perform();
        a.contextClick(mouse).build().perform();
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        
        
        
       // driver.navigate().refresh();
        username.clear();
        Thread.sleep(1000);
        username.click();
        Thread.sleep(1000);
        a.contextClick(username).build().perform();
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        r.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement scrollup = driver.findElement(By.xpath("//a[contains(text(),'Contact uploading and non-users')]"));
        js.executeScript("arguments[0].scrollIntoView(true)",scrollup);
        Thread.sleep(1000);
        //WebElement scrolldw = driver.findElement(By.name("email"));
        js.executeScript("arguments[0].scrollIntoView(false)",username);
        Thread.sleep(1000);
        username.clear();
        username.click();
        Thread.sleep(3000);
        js.executeScript("arguments[0].setAttribute('value','revathi')",username);
        //js.executeScript("arguments[0].setAttribute('value','kiran')", username);
        Thread.sleep(1000);
        WebElement login = driver.findElement(By.name("login"));
        js.executeScript("arguments[0].click()",login);
	}

}
