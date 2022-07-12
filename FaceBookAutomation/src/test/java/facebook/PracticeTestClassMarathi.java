package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.LoginOrSignUp;

public class PracticeTestClassMarathi {
	
	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		LoginOrSignUp loginOrSignUp = new LoginOrSignUp(driver);
		
		loginOrSignUp.clickOnMarathi();
	}
	
	

}
