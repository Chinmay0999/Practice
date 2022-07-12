package facebook;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
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
import pom.CreateNewAccount;
import pom.LoginOrSignUp;
import util.Utility;

public class VerifyLogInAndCreateAccount {
	
	
	
	WebDriver driver;
	LoginOrSignUp loginOrSignUp ;
    CreateNewAccount createNewAccount;
	String testID ;
	SoftAssert soft;
	
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
	public void launchBrowser()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginOrSignUp = new LoginOrSignUp(driver);
		createNewAccount = new CreateNewAccount(driver);
		soft = new SoftAssert();
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	
	public void enterCredentialsAndHitLoginButton()
	{
		testID = "US1003" ;
		loginOrSignUp.loginToAccount();
	}
	
	
	@Test
	public void changePageLanguageToMarathi()
	{
		testID = "US1004" ;
		loginOrSignUp.clickOnMarathi();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		soft.assertEquals(url , "https://mr-in.faceok.com/" , "Actual & accepted url are not matching");
		
		soft.assertEquals(title, "Facebook - लॉग इन किंवा साइन अप" ," Titles Not matching" );
		
		soft.assertAll();
		
	}
	
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws InterruptedException, IOException
	{
		if(ITestResult.FAILURE == result.getStatus())
		{
			Utility.captureScreenshot(driver, testID);
		}
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
	}

	
	
	@AfterClass
	public void afterClass()
	{ 
		loginOrSignUp = null ;
	    createNewAccount = null ;
		
	}
	
	@AfterTest
	public void afterTestUsedToQuitBrowser()
	{
		driver.quit();
		driver= null ;
		System.gc();
	}
	
	

}
