package com.selenium.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class App {
    public static void main(String[] args) {
	   App app = new App();
	
		try {
			app.automation();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
    }
    
    public void automation() throws MalformedURLException {
    	
    	RemoteWebDriver driver;
    	try {
    	URL resource = App.class.getResource("/geckodriver.exe");
    	URLClassLoader loader = (URLClassLoader) this.getClass().getClassLoader();
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Meghanil\\Desktop\\geckodriver.exe");
 		String URL = "http://www.google.com";
 		//String Node = "http://192.168.1.7:4444/wd/hub";
 		/*DesiredCapabilities cap = new DesiredCapabilities().firefox();
 		cap.setBrowserName("firefox");
 		cap.setPlatform(Platform.WINDOWS);*/
 		 
 		//driver = new RemoteWebDriver(new URL(Node), cap);
 		
 		driver = new FirefoxDriver();
 		driver.get(URL);
 		WebElement search = driver.findElement(By.id("lst-ib"));
 		search.sendKeys("Hello");
 		search.submit();
 		
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
 		
    /*	
    	 URL resource = App.class.getResource("/geckodriver.exe");
 	   	URLClassLoader loader = (URLClassLoader) this.getClass().getClassLoader();
 	   	System.out.println(loader.findResource("geckodriver.exe").getPath());
 	   	System.setProperty("webdriver.gecko.driver", loader.findResource("geckodriver.exe").getPath());
 	   String Node = "http://192.168.1.7:4444/wd/hub";
 	   DesiredCapabilities cap =  new DesiredCapabilities().FirefoxOptions();
 	   	//System.setProperty("webdriver.gecko.driver", "geckodriver\\geckodriver.exe");
 	  // 	RemoteWebDriver driver = new RemoteWebDriver(new URL(Node), cap);
 	  RemoteWebDriver driver = RemoteWebDriver(new URL(Node), cap);	
 	   driver.get("https://www.google.co.in");
 	   	WebElement textbox = driver.findElement(By.id("lst-ib"));
 	   	textbox.sendKeys("hello");
 	   	textbox.submit();
 	   	System.out.println("Page title: "+driver.getTitle());
 	*/   	
 	   	
    }
}
