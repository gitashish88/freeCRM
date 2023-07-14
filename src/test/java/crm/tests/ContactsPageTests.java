package crm.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import crm.core.WebDriverBase;
import crm.pages.ContactsPage;
import crm.pages.Homepage;
import crm.pages.LoginPage;
import crm.utilities.WebDriverBaseExtension;
import crm.utilities.*;

public class ContactsPageTests extends WebDriverBase {

	LoginPage loginpage;
	Homepage homepage;
	ContactsPage contactspage;

	public ContactsPageTests() {
		super();
		
	}

	@DataProvider
	public Object[][] getCRMTestData() {
		Object data[][] = TestUtility.getTestData("contactsData");
		return data;
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
	}

	@Test(priority = 1,dataProvider = "getCRMTestData")
	public void ValidateCreateContact(String firstname, String lastname) throws InterruptedException {

		homepage = loginpage.login(rb.getString("username"), rb.getString("password"));
		contactspage = homepage.clickAddContactButton();
		contactspage.enterContactDetails(firstname, lastname);
		contactspage = contactspage.clickSaveContactButton();
		
		//Thread.sleep(3000);
		//WebDriverBaseExtension.waitForPageToLoad();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
