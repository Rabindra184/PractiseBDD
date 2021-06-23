package stepDefinitions;
import PageObjects.RegisterPage;
import cucumber.TestContext;
import io.cucumber.java.en.And;
import managers.FileReaderManager;
import testDataTypes.User;

public class RegisterPageSteps {
	
	TestContext testContext;
	RegisterPage registerPage;
	
	 public RegisterPageSteps(TestContext context) {
		 testContext = context;
		 registerPage = testContext.getPageObjectManager().getRegisterPage();
	 }
	
	

	

	 @And("I enter all the {string} details and click on the Register button")
	public void i_enter_all_the_user_details_and_click_on_the_register_button(String userName) {
		 
		 User user = FileReaderManager.getInstance().getJsonReader().getUserByName(userName);
	 	 registerPage.Register(user);
	 	 
	   
	}

	

}
