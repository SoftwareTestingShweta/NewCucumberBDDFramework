package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "input-email")
	private WebElement emailField;
	
	@FindBy(id = "input-password")
	private WebElement passwordField;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//div[contains(@class,'alert-dismissible')]")
	private WebElement warningMessageForEmailAndPass;
	
	
	public void enterEmailField(String validEmailText) {
		emailField.sendKeys(validEmailText);
	}
	
	public void enterPasswordField(String validPasswordText) {
		passwordField.sendKeys(validPasswordText);
	}
	
	public AccountPage clickOnLoginButton() {
		loginButton.click();
	    return new AccountPage(driver);
	}

	public String getWaringMessageText() {
		String warningMessage =  warningMessageForEmailAndPass.getText();
		return warningMessage;
	}

}
