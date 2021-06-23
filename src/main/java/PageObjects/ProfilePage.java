package PageObjects;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	
	WebDriver driver;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='gotoStore']")
	private WebElement GotoBookStore;
	
	@FindBy(how=How.XPATH,using="//div[@class='text-right button di']//button[text()='Delete All Books']")
	private WebElement DeleteAllBooks;
	
	@FindBy(how=How.XPATH,using="//button[text()='Log out']")
	private WebElement Logout;
	
	@FindBy(how=How.XPATH,using="//span[text()='Profile']")
	private WebElement ProfileSideMenu;
	
	@FindBy(how=How.XPATH,using="//button[@id='closeSmallModal-ok']")
	private WebElement DeleteConfirmOK;
	
	@FindBy(how=How.XPATH,using="//*[@id='userName-value']")
	 private WebElement userNameValue;
	
	
	public String getUsername() {
		return userNameValue.getText();
		
	}

	
	public ProfilePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void gotoBookStore() {
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	   JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");

	    Actions action = new Actions(driver);

		action.moveToElement(GotoBookStore).click().build().perform();
	}
	
	
	public void logout() {
		
		Logout.click();
		
			
	}
	
	public void click_ProfileSideMenu() {
		
		ProfileSideMenu.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void DeleteAllBooks() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Actions action=new Actions(driver);
		action.moveToElement(DeleteAllBooks).click().build().perform();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DeleteConfirmOK.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
	}
}
