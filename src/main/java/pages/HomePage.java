package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()=\"My Account\"]")
	private WebElement myAccountDropMenu;
	
	@FindBy(linkText = "Register")
	private WebElement registerOption;
	
	@FindBy(linkText = "Login")
	private WebElement loginOption;
	
	@FindBy(xpath  = "//input[@name='search']")
	private WebElement searchBoxField;
	
	@FindBy(xpath  = "//span[@class='input-group-btn']/descendant::button")
	private WebElement searchButton;
	
	
	public void clickOnMyAccount() {
		myAccountDropMenu.click();
	}
	
	public LoginPage clickOnLoginOption() {
		loginOption.click();
		return new LoginPage(driver);
	}
	
	public RegisterPage clickOnRegisterOption() {
		registerOption.click();
		return new RegisterPage(driver);
	}
	
	public void enterInSearchBoxField(String enterProduct) {
		searchBoxField.sendKeys(enterProduct);
	}

	public SearchResultPage clickOnSearchButton() {
		searchButton.click();
		return new SearchResultPage(driver);
	}
	
}
