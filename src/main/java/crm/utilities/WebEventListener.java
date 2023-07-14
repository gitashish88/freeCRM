package crm.utilities;
//skip this class as of now
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.events.WebDriverListener;

import crm.core.WebDriverBase;

public class WebEventListener extends WebDriverBase implements WebDriverListener {

	public void beforeNavigate(String url, WebDriver driver) {
		System.out.println("Before navigating to url " + url);
	}
	
	public void beforeElementClick(WebElement element, WebDriver driver) {
		System.out.println("Trying to click on element "+ element.toString());
	}
	
	public void afterElementClick(WebElement element, WebDriver driver) {
		System.out.println("After click on element "+ element.toString());
	}
}
