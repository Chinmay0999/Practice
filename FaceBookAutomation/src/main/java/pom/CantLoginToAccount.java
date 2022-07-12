package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CantLoginToAccount {
	
	@FindBy (xpath = "//input[@placeholder='Email address or mobile number']")
	private WebElement enterEmail ;
	
	@FindBy (xpath = "//a[text()='Cancel']")
	private WebElement cancel ;
	
	@FindBy (xpath = "//button[text()='Search']")
	private WebElement search ;
	
	
	// Constructor 
	
	public CantLoginToAccount(WebDriver driver)
	{
		PageFactory.initElements(driver,this);		
	}
	

	public void enterUserEmail()
	{
		enterEmail.click();
		enterEmail.sendKeys("Adgchcj@gmail.com");
		
	}
	
	public void clickSearchButton()
	{
		search.click();
	}
	

	public void cancelbutton()
	{
		cancel.click();
	}
	
	
	
	
	
	

}
