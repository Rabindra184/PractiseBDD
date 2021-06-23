package managers;

import org.openqa.selenium.WebDriver;
import PageObjects.BookStorePage;
import PageObjects.LoginPage;
import PageObjects.ProfilePage;
import PageObjects.RegisterPage;

public class PageObjectManager {

	private WebDriver driver;

	private LoginPage loginPage;

	private ProfilePage profilePage;

	private BookStorePage bookStorePage;
	
	private RegisterPage registerPage;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	public LoginPage getLoginPage() {

		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;

	}
	
	public RegisterPage getRegisterPage() {

		return (registerPage == null) ? registerPage = new RegisterPage(driver) : registerPage;

	}

	public ProfilePage getProfilepage() {
		return (profilePage == null) ? profilePage = new ProfilePage(driver) : profilePage;

	}

	public BookStorePage getBookStorePage() {

		return (bookStorePage == null) ? bookStorePage = new BookStorePage(driver) : bookStorePage;

	}

}