package facebook;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Browsers.Base;
import pom.CantLoginToAccount;
import pom.CreateNewAccount;
import pom.LoginOrSignUp;


public class VerifyForgotPasswordAndMarathi<ITestResult> {
	
	WebDriver driver ;
	LoginOrSignUp loginOrSignUp ;
	CantLoginToAccount cantLoginToAccount;
	SoftAssert soft;
	String testID ;
	CreateNewAccount createNewAccount ;
	
	
	
	@Parameters ("browserName")
	@BeforeTest
	public void beforeTestUsedToLaunchBrowser(String browser)
	{
		if(browser.equals("Chrome"))
		{
			driver = Base.OpenChromeBrowser();
		}
		
		if(browser.equals("Firefox"))
		{
			driver = Base.OpenFirefoxBrowser();
		}
		
	}
	@BeforeClass
	public void beforeClassUsedToWritecommonObjects()
	{
		loginOrSignUp = new LoginOrSignUp(driver);
		cantLoginToAccount = new CantLoginToAccount(driver);
		soft = new SoftAssert();
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver.get("https://www.facebook.com/");
		
		
	}
	
	@Test (priority=1)
	
	public void clickOnForgotPasswordAndProceed()
	{
		testID = "US1001" ;
		loginOrSignUp.clickOnForgotPassword();
		cantLoginToAccount.enterUserEmail();
		cantLoginToAccount.clickSearchButton();
		
	}
	
	
	@Test (priority=2)
	
	public void enterCredentialsAndCreateAccount()
	{
		testID = "US1002" ;
		loginOrSignUp.clickOnCreateAccount();
		
		
		createNewAccount.createAnAccount();
		 
		
	}
	
	
@AfterMethod
	
	public void afterMethod() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
	}
	
	
	
	
	@AfterClass
	public void afterClass()
	{
		loginOrSignUp = null;
		cantLoginToAccount = null;
		soft = null;
	}
	
	@AfterTest
	public void afterTestUsedToQuitBrowser()
	{
		driver.quit();
		driver= null ;
		System.gc();
	}
	

}
