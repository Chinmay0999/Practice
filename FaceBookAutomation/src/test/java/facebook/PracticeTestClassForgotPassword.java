package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.CantLoginToAccount;
import pom.LoginOrSignUp;

public class PracticeTestClassForgotPassword {
	
	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		LoginOrSignUp loginOrSignUp = new LoginOrSignUp(driver);
		
		loginOrSignUp.clickOnForgotPassword();
		
		Thread.sleep(1000);
		
		CantLoginToAccount cantLoginToAccount = new CantLoginToAccount(driver);
		
		cantLoginToAccount.enterUserEmail();
		
		Thread.sleep(1000);
		
		cantLoginToAccount.clickSearchButton();
	}

}
