package pom;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginOrSignUp {	
		
		@FindBy (xpath = "//input[@id='email']") 
		private WebElement username ;
		
		@FindBy (xpath = "//input[@placeholder='Password']")
		private WebElement password ;
		
		@FindBy (xpath = "//button[text()='Log In']")
		private WebElement logInButton ;
		
		@FindBy (xpath = "//a[text()='Forgotten password?']")
		private WebElement forgotPassword ;
		
		@FindBy (xpath = "//a[@data-testid='open-registration-form-button']")
		private WebElement createAccount ;
		
		@FindBy (xpath = "//a[text()='Create a Page']")
		private WebElement createPage ;
		
		@FindBy (xpath = "//a[@title='Marathi']")
		private WebElement marathi ;
		
		@FindBy (xpath = "Common , matching xpaths for multiple elements")
		private List<WebElement> elements;
		
		private WebDriver driver  ;
		private WebDriverWait wait  ;
		private Actions act ;
		private JavascriptExecutor js ;
		
		public LoginOrSignUp(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			this.driver = driver ;
			this.wait =  new WebDriverWait(driver,30); ;
			act = new Actions(driver);
			js =  (JavascriptExecutor)driver;
			
		}
		
		public void sendUsername()
		{
			
			wait.until(ExpectedConditions.visibilityOf(username));
			username.sendKeys("chinmaybjkk");
			
		}
		
		public void sendPassword()
		{
			password.sendKeys("Sgfhf@6464gjkgk");
			wait.until(ExpectedConditions.visibilityOf(password));
		}
		
		
		public void clickOnLogInButton()
		{
			logInButton.click();
		}
		
		public void clickOnForgotPassword()
		{
			
			act.moveToElement(forgotPassword).perform();
			act.click().perform();
		}
		
		public void clickOnCreateAccount()
		{
			
			js.executeScript("arguments[0]. scrollIntoView(true);", createAccount);
			createAccount.click();
		}
		
		public void clickOnCreatePage()
		{
			createPage.click();
		}
		
		public void clickOnMarathi()
		{
			marathi.click();
		}
		
		//or
		
		public void loginToAccount()
		{
			username.sendKeys("chinmaybjkk");
			password.sendKeys("Sgfhf@6464gjkgk");
			logInButton.click();
		}
	
	

}
