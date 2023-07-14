package crm.core;

import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBase {

	public static WebDriver driver;
	public static ResourceBundle rb;
	public static long TIMEOUT = 20;
	
	public WebDriverBase(){
		rb = ResourceBundle.getBundle("config");
	}
	
	public static void initialization() {
		if(rb.getString("browser").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.get(rb.getString("baseURL"));
	}
}
