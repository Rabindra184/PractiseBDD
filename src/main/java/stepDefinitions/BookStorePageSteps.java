package stepDefinitions;

import PageObjects.BookStorePage;
import cucumber.TestContext;
import enums.Context;
import io.cucumber.java.en.Given;

public class BookStorePageSteps {

	TestContext testContext;
	BookStorePage bookStorePage;

	public BookStorePageSteps(TestContext context) {
		testContext = context;
		bookStorePage = testContext.getPageObjectManager().getBookStorePage();
	}

	@Given("I click on the book link")
	public void i_click_on_the_book_link() throws InterruptedException {
		
		String UserName=bookStorePage.getUserName();
		testContext.scenarioContext.setContext(Context.USER_NAME, UserName);

		bookStorePage.AddBook();
	}

	@Given("I click on the AddtoyourCollection button")
	public void i_click_on_the_addtoyour_collection_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		bookStorePage.addtoyourCollection();
	}

}
