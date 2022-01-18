package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {

	public static WebDriver driver;
//	static String browserName;

	public static void ConfigureBrowser(String browserName) {
		//browserName = PropertiesFileReader.getUserDefinedProperty("browser.name");
		if (browserName.toLowerCase().contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.toLowerCase().contains("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}

		else if (browserName.toLowerCase().contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	public static void exitBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
