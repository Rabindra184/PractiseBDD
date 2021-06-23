package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import PageObjects.ProfilePage;
import cucumber.TestContext;
import enums.Context;
import io.cucumber.java.en.Given;

public class ProfilePageSteps {

	TestContext testContext;
	ProfilePage profilePage;

	public ProfilePageSteps(TestContext context) {
		testContext = context;
		profilePage = testContext.getPageObjectManager().getProfilepage();
	}

	@Given("I click on the GotoBook Store")

	public void i_click_on_the_goto_book_store() throws InterruptedException {
		profilePage.gotoBookStore();

	}

	@Given("I click on the Profile")
	public void i_click_on_the_profile() throws InterruptedException {
		profilePage.click_ProfileSideMenu();

	}

	@Given("I Click on the DellAllBooks button")
	public void i_click_on_the_dell_all_books_button() throws InterruptedException {

		profilePage.DeleteAllBooks();

	}

	@Given("I click on the Logout button")
	public void i_click_on_the_logout_button() throws IOException {
		Assert.assertEquals((String)testContext.scenarioContext.getContext(Context.USER_NAME),profilePage.getUsername());
		
		profilePage.logout();
	}

}
