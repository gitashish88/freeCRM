package crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crm.core.WebDriverBase;

public class LoginPage extends WebDriverBase{

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[contains(text(),'Login')]")
	WebElement loginButton;
	
	public Homepage login(String name, String pass) {
		username.sendKeys(name);
		password.sendKeys(pass);
		loginButton.click();
		
		return new Homepage();
	}
	
	public String validatePageTitle() {
		return driver.getTitle();
	}
}
