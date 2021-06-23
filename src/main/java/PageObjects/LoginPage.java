package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	

	@FindBy(how = How.XPATH, using = "//*[@id='userName']")
	private WebElement UserName;

	@FindBy(how = How.XPATH, using = "//*[@id='password']")
	private WebElement Password;

	@FindBy(how = How.XPATH, using = "//*[@id='login']")
	private WebElement Login;
	
	@FindBy(how = How.XPATH, using = "//*[@id='newUser']")
	private WebElement NewUser;
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);

	}

	public void enter_UserName(String Username) {

		UserName.clear();
		UserName.sendKeys(Username);
	}

	public void enter_Password(String Pass) {

		Password.clear();
		Password.sendKeys(Pass);
	}

	public void click_Login() {
		Login.click();

	}
	
	public void click_NewUser() {
		NewUser.click();

	}
	
	
	public void navigateTo_LoginPage(String url) {
		 driver.get(url);
		 }

}
