package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccount {
	
	@FindBy (xpath = "//input[@name='firstname']") 
	private WebElement firstname ;
	
	@FindBy (xpath = "//input[@name='lastname']")
	private WebElement surname ;
	
	@FindBy (xpath = "//input[@name='reg_email__']")
	private WebElement mobileNumberOrEmail ;
	
	@FindBy (xpath = "//input[@name='reg_email_confirmation__']")
	private WebElement reMobileNumberOrEmail ;
	
	@FindBy (xpath = "//input[@id='password_step_input']")
	private WebElement password ;
	
	@FindBy (xpath = "//select[@aria-label='Day']")
	private WebElement dayOfBirth ;
	
	@FindBy (xpath = "//select[@name='birthday_month']")
	private WebElement monthOfBirth ;
	
	@FindBy (xpath = "//select[@name='birthday_year']")
	private WebElement yearOfBirth ;
	
	@FindBy (xpath = "(//input[@name='sex'])[1]")
	private WebElement female ;
	
	@FindBy (xpath = "(//input[@name='sex'])[2]")
	private WebElement male ;
	
	@FindBy (xpath = "(//input[@name='sex'])[3]")
	private WebElement custom ;
	
	@FindBy (xpath = "//select[@aria-label='Select your pronoun']")
	private WebElement pronoun ;
	
	@FindBy (xpath = "//input[@name='custom_gender']")
	private WebElement genderOptional ;
	
	@FindBy (xpath = "(//button[text()='Sign Up'])[1]")
	private WebElement signUpButton ;
	
	
	public CreateNewAccount(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void createAnAccount()
	{
		
		firstname.sendKeys("Shaun");
		
		surname.sendKeys("John");
		
		mobileNumberOrEmail.sendKeys("JohnShaun8998@gmail.com");
		
		reMobileNumberOrEmail.sendKeys("JohnShaun8998@gmail.com");
		
		password.sendKeys("JohnShaun@9999");
		
		Select sday = new Select(dayOfBirth);
		sday.selectByValue("12");
		
		Select smonth = new Select(monthOfBirth);
		smonth.selectByIndex(11);
		
		Select syear = new Select(yearOfBirth);
		syear.selectByVisibleText("1999");
		
		female.click();
		
		male.click();
		
		custom.click();
		
		Select spro = new Select(pronoun);
		spro.selectByVisibleText("He: \"Wish him a happy birthday!\"");
		
		genderOptional.sendKeys("xchdjfj");
		
		signUpButton.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	


