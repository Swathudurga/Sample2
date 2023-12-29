package org.selenium;


import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserLaunch {
	
		public static WebDriver driver;

		public static void screenCapture(String name) throws IOException {

			TakesScreenshot ts = (TakesScreenshot) driver;
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);

			File targetFile = new File("C:\\Users\\Venu\\eclipse\\java-2023-032\\AdapHotal\\adahotal\\" + name + ".png");

			FileUtils.copyFile(sourceFile, targetFile); // Throw IOException

		}

		public static void main(String[] args) throws IOException, InterruptedException {

			// To Configure Browser
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Welcome\\eclipse-workspace\\SeleniumOctober11.00AMBatch2023\\driver\\chromedriver.exe");

			driver = new EdgeDriver();

			// To Launch url
			driver.get("https://www.amazon.in/");

			// To maximize the windows
			driver.manage().window().maximize();

			WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.sendKeys("iphone 15 pro max", Keys.ENTER);
			
			WebElement iphone15white = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[4]"));
			iphone15white.click();
			
			// To Find Windows Id // current Windows ID // Parent Windows ID
			String parentWindowsID = driver.getWindowHandle();
			System.out.println("Parent Windows ID:"+parentWindowsID);
			
			// To Find All Windows ID 
			Set<String> allwindowsID = driver.getWindowHandles();
			System.out.println("All Windows ID :"+allwindowsID);
			
			for (String x : allwindowsID) {
				
				if (!parentWindowsID.equals(x)) {
					
					System.out.println("First Child Windows ID :"+x);
					// To Switch First Child Windows 
					driver.switchTo().window(x);
					
				}
				
			}
			
			
			
			WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
	        addToCart.click();
	        screenCapture("addcart1");
	        
	        // To Switch Back to Parent Windows again
	        driver.switchTo().window(parentWindowsID);
	        
	        WebElement iphoneblue2 = driver.findElement(By.xpath("(//span[text()='Apple iPhone 15 Pro Max (256 GB) - Blue Titanium'])[3]"));
	        iphoneblue2.click();
	        
	        
	        // To get All the Windows ID again
	        Set<String> allwindowsID2 = driver.getWindowHandles();
	        System.out.println("All windows id 2:"+allwindowsID2);
	        
	         List<String> li = new LinkedList<String>();
	        li.addAll(allwindowsID2);
	        
	        String secondChildWindowsID = li.get(2);
	        System.out.println("Second Windows id s:"+secondChildWindowsID);
	        
	        // To Switch to Second Windows id
	        driver.switchTo().window(secondChildWindowsID);
	    	
			WebElement addToCart2 = driver.findElement(By.id("add-to-cart-button"));
	        addToCart2.click();
	        screenCapture("addToCart2");
	        
	  //  neynu    //to Switch back to parent windows again
	        driver.switchTo().window(parentWindowsID);
	        WebElement appleiphoneblack = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
	        appleiphoneblack.click();
	        
	        
	        //to get all the windows id again
	        Set<String> allwindowsID3 = driver.getWindowHandles();
	        System.out.println("All windows id 3:"+allwindowsID3);
	        
	        List<String>li2=new LinkedList<String>();
	        li2.addAll(allwindowsID3);
	        
	        String thirdChildWindowsID = li2.get(3);
	        System.out.println("third Window id 3:"+thirdChildWindowsID);
	        
	        //to switch to third window id
	        driver.switchTo().window(thirdChildWindowsID);
	        
	        WebElement addToCart3 = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	        addToCart3.click();
	        screenCapture("addToCart3");
	        
	        //to switch to parent windows again
	        driver.switchTo().window(parentWindowsID);
	        WebElement searchbox2 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	        searchbox2.sendKeys("samsung s22 ultra 5g",Keys.ENTER);
	        
	        WebElement samsungalaxyS22 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
	        samsungalaxyS22.click();
	        
	        //to get all the windows id again  
	        Set<String> allwindowsID4 = driver.getWindowHandles();
	        System.out.println("All windows id 4:"+allwindowsID4);
	        
	        List<String> li3=new LinkedList<String>();
	        li3.addAll(allwindowsID4);
	        
	        String fourthChildWindowID = li3.get(4);
	        System.out.println("fourth window id 4:"+fourthChildWindowID);
	        
	        //to switch to fourth window id
	        driver.switchTo().window(fourthChildWindowID);
	        
	        WebElement addToCart4 = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	        addToCart4.click();
	        screenCapture("addToCart4");
	        
	      //to switch to parent windows again
	        driver.switchTo().window(parentWindowsID);
	        
	        
	        
	        WebElement nokiag425gmobile = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
	        nokiag425gmobile.click();
	        
	      //to get all the windows id again  
	        Set<String> allwindowsID5 = driver.getWindowHandles();
	        System.out.println("All windows id 5:"+allwindowsID5);
	        
	        List<String> li4=new LinkedList<String>();
	        li4.addAll(allwindowsID5);
	        
	        String fifthChildWindowID = li4.get(5);
	        System.out.println("fifth window id 5:"+fifthChildWindowID);
	        
	        //to switch to fourth window id
	        driver.switchTo().window(fifthChildWindowID);
	        
	        WebElement addToCart5 = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	        addToCart5.click();
	        screenCapture("addToCart5");
	        
		}

	}


