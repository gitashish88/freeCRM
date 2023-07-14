package crm.pages;

import org.openqa.selenium.support.PageFactory;

import crm.core.WebDriverBase;

public class DealsPage extends WebDriverBase {

	public DealsPage() {
		PageFactory.initElements(driver, this);
	}
	
}
