package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver OpenChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
		
	}
	
	public static WebDriver OpenFirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver","G:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
		
	}

}
