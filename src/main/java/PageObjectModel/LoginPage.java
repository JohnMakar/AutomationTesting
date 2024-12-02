package PageObjectModel;


import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements((SearchContext) this, driver);
	}
	
	@FindBy(xpath = "//*[@id=\"user-name\"]")
	private WebElement userNameField ;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	private WebElement passwordField;
	
	@FindBy(xpath = "//*[@id=\"login-button\"]")
	private WebElement LoginBtn;
	
	public void setUserName(String username) {
		userNameField.sendKeys(username);
	}
	public void setPassword(String Pass) {
		passwordField.sendKeys(Pass);
	}
	
	public void ClickLogin() {
		LoginBtn.click();
	}
}
