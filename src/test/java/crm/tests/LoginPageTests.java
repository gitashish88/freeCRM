package crm.tests;

import org.testng.Assert;
import org.testng.annotations.*;

import crm.core.WebDriverBase;
import crm.pages.*;

public class LoginPageTests extends WebDriverBase{

	LoginPage loginpage;
	Homepage homepage;
	
	public LoginPageTests() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
	}
	
	@Test(priority=1)
	public void validateLoginPageTitle() {
		String title = loginpage.validatePageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test(priority=2)
	public void loginCheck() {
		homepage = loginpage.login(rb.getString("username"), rb.getString("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
