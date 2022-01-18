package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {
	
	public static WebElement myExplicitWait(WebDriver driver , String xpath){
		WebDriverWait myWait = new WebDriverWait(driver, 180);
		WebElement element = myWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
		return element;
	}

}
