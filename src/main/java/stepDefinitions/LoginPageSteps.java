package stepDefinitions;
import PageObjects.LoginPage;
import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import managers.FileReaderManager;

public class LoginPageSteps {

	TestContext testContext;
	LoginPage loginPage;
	
	 public LoginPageSteps(TestContext context) {
		 testContext = context;
		 loginPage = testContext.getPageObjectManager().getLoginPage();
	 }
	@Given("I go to loginURL on Browser")
	public void i_go_to_login_url_on_browser() {
	
	
	loginPage.navigateTo_LoginPage(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());

	}
	
	@When("I click on the New user button")
	public void i_click_on_the_new_user_button() {
	   
		loginPage.click_NewUser();
	}

	@Given("I enter loginusername as Username")
	public void i_enter_loginusername_as_username() throws InterruptedException {

		loginPage.enter_UserName("TEST01");
		
	}

	@Given("I enter loginpassword as Password")
	public void i_enter_loginpassword_as_password() throws InterruptedException {
		
		loginPage.enter_Password("Test@123");
		

	}

	@Given("I click on loginButton")
	public void i_click_on_login_button() throws InterruptedException {
		loginPage.click_Login();
		

	}

	
}
