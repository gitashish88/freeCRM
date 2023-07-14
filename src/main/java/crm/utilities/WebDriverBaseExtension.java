package crm.utilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import crm.core.WebDriverBase;

public class WebDriverBaseExtension extends WebDriverBase{

	
	
	public WebDriverBaseExtension() {
		super();
	}
	
	public static void waitForPageToLoad() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("return document.readyState").toString().equals("complete");
	}
}
