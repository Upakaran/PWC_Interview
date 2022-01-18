package pageObjects;

import org.assertj.core.api.SoftAssertionError;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PropertiesFileReader;

import org.openqa.selenium.support.How;

public class ToolsQAFormPage {
	
	WebDriver driver;
	
	public ToolsQAFormPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	
	//@FindBy(id = "firstName")
	@FindBy(how = How.ID, using = "firstName")
	@CacheLookup
	 WebElement firstName;
	
	@FindBy(how = How.ID, using = "lastName")
	@CacheLookup
	 WebElement lastName;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='name@example.com']")
	@CacheLookup
	 WebElement email;
	
	@FindBy(how = How.XPATH, using = "//label[@for='gender-radio-1']")
	@CacheLookup
	 WebElement genderMale;
	
	@FindBy(how = How.XPATH, using = "//label[@for='gender-radio-2']")
	@CacheLookup
	 WebElement genderFemale;
	
	@FindBy(how = How.XPATH, using = "//label[@for='gender-radio-3']")
	@CacheLookup
	 WebElement genderOther;
	
	@FindBy(how = How.ID, using = "userNumber")
	@CacheLookup
	 WebElement mobNo;
	
	@FindBy(how = How.ID, using = "dateOfBirthInput")
	@CacheLookup
	 WebElement DOB;
	
	By datePickerYear = By.xpath("//select[@class='react-datepicker__year-select']");
	
	By datePickerMonth = By.xpath("//select[@class='react-datepicker__month-select']");
	
	By datePickerday = By.xpath("//div[@class='react-datepicker__week']//div");
	
	By confirmationText = By.id("example-modal-sizes-title-lg");
	
	@FindBy(how = How.XPATH, using = "//div[@id='subjectsContainer']/div/div")
	@CacheLookup
	 WebElement subjects;
	
	@FindBy(how = How.XPATH, using = "//label[@for='hobbies-checkbox-1']")
	@CacheLookup
	 WebElement hobbySports;
	
	@FindBy(how = How.XPATH, using = "//label[@for='hobbies-checkbox-2']")
	@CacheLookup
	 WebElement hobbyReading;
	
	@FindBy(how = How.XPATH, using = "//label[@for='hobbies-checkbox-3']")
	@CacheLookup
	 WebElement hobbyMusic;
	
	@FindBy(how = How.ID, using = "uploadPicture")
	@CacheLookup
	 WebElement selectPicture;
	
	@FindBy(how = How.ID, using = "currentAddress")
	@CacheLookup
	 WebElement currentAddress;
	
	@FindBy(how = How.XPATH, using = "//div[@class=' css-1hwfws3']//div[text()='Select State']")
	@CacheLookup
	 WebElement selectState;
	
	@FindBy(how = How.XPATH, using = "//div[@class=' css-1hwfws3']//div[text()='Select City']")
	@CacheLookup
	 WebElement selectCity;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	@CacheLookup
	 WebElement submitBtn;
	
	public void openTestSite() throws Throwable{
		driver.get(PropertiesFileReader.getUserDefinedProperty("browser.baseURL"));
		Thread.sleep(1000);
	}
	
	public void enterFirstName(String firstname) throws Throwable {
		Actions action = new Actions(driver);
		action.sendKeys(firstName, firstname).build().perform();
		Thread.sleep(1000);
	}
	
	public void enterLastName(String lastname) throws Throwable {
		Actions action = new Actions(driver);
		action.sendKeys(lastName, lastname).build().perform();
		Thread.sleep(1000);
	}
	
	public void enterEmail(String emailfed) throws Throwable {
		Actions action = new Actions(driver);
		action.sendKeys(email, emailfed).build().perform();
		Thread.sleep(1000);
	}
	
	public void selectGender(String gender) throws Throwable {
		Actions action = new Actions(driver);
		if(gender.equalsIgnoreCase("male")){
			action.click(genderMale).build().perform();
		}
		else if(gender.equalsIgnoreCase("female")){
			action.click(genderFemale).build().perform();
		}
		else if(gender.equalsIgnoreCase("other")){
			action.click(genderOther).build().perform();
		}
		Thread.sleep(1000);
	}
	
	public void enterMobileNo(String MobileNo) throws Throwable {
		Actions action = new Actions(driver);
		action.sendKeys(mobNo, MobileNo).build().perform();
		Thread.sleep(1000);
	}
	
	public void selectCorrectDOB(String dob) throws Throwable {
		String[] myArr = dob.split("( )+");
		String day = myArr[0];
		String month = myArr[1];
		String year = myArr[2];
		Actions action = new Actions(driver);
		action.click(DOB).build().perform();
	//	action.sendKeys(mobNo, MobileNo).build().perform();*/
		Thread.sleep(1000);
		
		Select selectYear = new Select(driver.findElement(datePickerYear));
		selectYear.selectByValue(year);
		Thread.sleep(2000);
		
		Select selectMonth = new Select(driver.findElement(datePickerMonth));
		selectMonth.selectByVisibleText(month);
		Thread.sleep(2000);
		
		String daySelect = datePickerday+"[text()='"+day+"']";
		
		
		WebElement dayElement =  driver.findElement(By.xpath(daySelect));
		
		action.click(dayElement).build().perform();
		Thread.sleep(1000);
	}
	
	public void enterSubject(String subject) throws Throwable {
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100);");*/
		Thread.sleep(1000);
	/*	js.executeScript("argument[0].scrollIntoView;", subjects);*/
		Actions action = new Actions(driver);
		action.moveToElement(subjects).sendKeys(subjects, subject).build().perform();
		Thread.sleep(1000);
		//action.moveToElement(subjects).click(subjects).build().perform();
		action.sendKeys(subjects, Keys.ENTER).build().perform();
		Thread.sleep(1000);
	}
	
	public void selectHobby(String hobby) throws Throwable {
		
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView;", hobbySports);*/
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100);");
		
		Actions action = new Actions(driver);
		if(hobby.equalsIgnoreCase("sports")){
			action.moveToElement(hobbySports).click(hobbySports).build().perform();
		}
		else if(hobby.equalsIgnoreCase("reading")){
			action.moveToElement(hobbyReading).click(hobbyReading).build().perform();
		}
		else if(hobby.equalsIgnoreCase("music")){
			action.moveToElement(hobbyMusic).click(hobbyMusic).build().perform();
		}
		Thread.sleep(1000);
	}
	
	public void uploadPicture() throws Throwable {
	/*	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView", selectPicture);*/
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.sendKeys(selectPicture, PropertiesFileReader.getUserDefinedProperty("project.docUploadPath")).build().perform();
		Thread.sleep(2000);
	}
	
	public void enterCurrentAddress(String address) throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView", currentAddress);
		Actions action = new Actions(driver);
		action.moveToElement(currentAddress).sendKeys(currentAddress, address);
		action.build().perform();
		Thread.sleep(2000);
	}
	
	public void selectCity(String cityName) throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView", selectCity);
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(selectCity).sendKeys(selectCity, cityName);
		action.build().perform();
		Thread.sleep(2000);
	}
	
	public void selectState(String stateName) throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView", selectState);
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(selectState).sendKeys(selectState, stateName);
		action.build().perform();
		Thread.sleep(2000);
	}
	
	public void clickSubmitBtn() throws Throwable{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView", submitBtn);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(submitBtn).click(submitBtn).build().perform();
		Thread.sleep(2000);
	}
	
	public void validateConfirmationMsg (String msg) throws Throwable{
		String actualMsg = driver.findElement(confirmationText).getText();
		String expectedMsg = msg;
		SoftAssertions soft = new SoftAssertions();
		soft.assertThat(actualMsg).isEqualTo(expectedMsg);
		soft.assertAll();
		
	}
}
