package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScreeptExcecution {
	
	public static WebDriver driver;
	public static void ScreenCaps(String name) throws IOException {
        TakesScreenshot tc=(TakesScreenshot)driver;
		
		File source = tc.getScreenshotAs(OutputType.FILE);
		
		File distination=new File("C:\\Users\\Venu\\eclipse\\java-2023-032\\Selenium1\\scr̥eenshot\\"+ name +".png");
		FileUtils.copyFile(source, distination);
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("WebDriver.Edge.Driver", 
				"C:\\Users\\Venu\\eclipse\\java-2023-032\\Xpath\\driver\\chromedriver.exe");
		 driver=new EdgeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
		email.sendKeys("fdghja");
		Thread.sleep(2000);
//		ScreenCaps("fbemaile");
		
		WebElement pass = driver.findElement(By.xpath("//*//*[@id='pass']"));
		pass.sendKeys("cjkkjhfhcv");
		Thread.sleep(2000);
//		ScreenCaps("pass");
		
		WebElement log = driver.findElement(By.xpath("//*[@name='login']"));
		log.click();
		Thread.sleep(2000);
//		ScreenCaps("log");
		
		
		

	}

}
