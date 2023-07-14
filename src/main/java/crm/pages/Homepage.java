package crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crm.core.WebDriverBase;

public class Homepage extends WebDriverBase{

	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(@href,'contacts')]/following :: button[1]")
	WebElement addContactButton;
	
	public ContactsPage clickContactsLink() {
		contactsLink.click();
		return new ContactsPage();
	}
	
	public ContactsPage clickAddContactButton() {
		Actions action = new Actions(driver);
		action.moveToElement(addContactButton).perform();
		addContactButton.click();
		return new ContactsPage();
	}
	
}
