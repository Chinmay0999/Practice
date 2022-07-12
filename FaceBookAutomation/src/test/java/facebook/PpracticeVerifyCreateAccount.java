package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.CreateNewAccount;
import pom.LoginOrSignUp;

public class PpracticeVerifyCreateAccount {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		// Test case 2  ----> Create fb account
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		LoginOrSignUp loginOrSignUp = new LoginOrSignUp(driver);
		
		loginOrSignUp.clickOnCreateAccount();
		
		
		CreateNewAccount createNewAccount = new CreateNewAccount(driver);
		
		createNewAccount.createAnAccount();
		
		
	}

}
