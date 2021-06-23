package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import testDataTypes.User;

public class RegisterPage {
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='firstname']")
	private WebElement firstName;

	@FindBy(how = How.XPATH, using = "//*[@id='lastname']")
	private WebElement lastName;

	@FindBy(how = How.XPATH, using = "//*[@id='userName']")
	private WebElement userName;
	
	@FindBy(how = How.XPATH, using = "//*[@id='password']")
	private WebElement password;
	
	@FindBy(how = How.XPATH, using = "//*[@id='recaptcha-anchor']/div[1]")
	private WebElement captcha;
	
	@FindBy(how = How.XPATH, using = "//*[@id='register']")
	private WebElement Register;
		
	@FindBy(how = How.XPATH, using = "//*[@id='gotologin']")
	private WebElement backtologin;
	
	
	
	public RegisterPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	
	public void Register(User user) {
		
		firstName.sendKeys(user.FirstName);
		lastName.sendKeys(user.LastName);
		userName.sendKeys(user.UserName);
		password.sendKeys(user.Password);
		//captcha.click();
		//Register.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
