package PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BookStorePage {
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//*[@id='see-book-Learning JavaScript Design Patterns']/a")
	 private WebElement booklink;
	
	@FindBy(how=How.XPATH,using="//button[text()='Add To Your Collection']")
	 private WebElement AddtoyourCollection;
	
	@FindBy(how=How.XPATH,using="//*[@id='userName-value']")
	 private WebElement userNameValue;
	
	public BookStorePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public void AddBook() {
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		booklink.click();
	}
	public void addtoyourCollection() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		AddtoyourCollection.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public String getUserName() {
		return userNameValue.getText();
		 }
}
