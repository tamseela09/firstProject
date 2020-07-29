package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SingeltonDriver {
	
	private WebDriver driver; 
	
	
	public WebDriver getDriver() {
		return driver;
	}
	public SingeltonDriver(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebDriver openBrowser(String browser,String url) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.navigate().to(url);
			
		}
		
		else if (browser.equalsIgnoreCase("Firefox")) { 

			driver = new FirefoxDriver(); 

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 

			driver.manage().window().maximize(); 

			driver.get("https://www.google.com/"); 

			driver.navigate().to(url); 

			}
			
			else if (browser.equalsIgnoreCase("Safari")) { 

			driver = new SafariDriver(); 

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
			
			driver.manage().window().maximize(); 

			driver.get("https://www.google.com/"); 


			driver.navigate().to(url); 
			 

			} 

			else {

			System.out.println("Incorrect Browser!!!!!"); 

			} 
			 return driver;

			} 

			 
	}


