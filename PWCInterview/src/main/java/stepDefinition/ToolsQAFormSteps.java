package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ToolsQAFormPage;
import utilities.BrowserUtility;

public class ToolsQAFormSteps {
	
	WebDriver driver = BrowserUtility.driver;
	ToolsQAFormPage toolsQAFormPage;
	
	@Given("^Browser is open and user navigates to ToolQA Practise form site$")
	public void browser_is_open_and_user_navigates_to_ToolQA_Practise_form_site() throws Throwable {
		toolsQAFormPage = new ToolsQAFormPage(driver);
		toolsQAFormPage.openTestSite();
	}

	@When("^User enters the First Name in correct field$")
	public void user_enters_the_First_Name_in_correct_field(DataTable dataTable) throws Throwable {
		toolsQAFormPage = new ToolsQAFormPage(driver);
		toolsQAFormPage.enterFirstName(dataTable.asLists(String.class).get(1).get(0));
	}

	@When("^user enters the last Name in correct field$")
	public void user_enters_the_last_Name_in_correct_field(DataTable dataTable) throws Throwable {
		toolsQAFormPage = new ToolsQAFormPage(driver);
		toolsQAFormPage.enterLastName(dataTable.asLists(String.class).get(1).get(0));
	}

	@When("^User enters email in correct field$")
	public void user_enters_email_in_correct_field(DataTable dataTable) throws Throwable {
		toolsQAFormPage = new ToolsQAFormPage(driver);
		toolsQAFormPage.enterEmail(dataTable.asLists(String.class).get(1).get(0));
	}

	@When("^User selects correct gender$")
	public void user_selects_correct_gender(DataTable dataTable) throws Throwable {
		toolsQAFormPage = new ToolsQAFormPage(driver);
		toolsQAFormPage.selectGender(dataTable.asLists(String.class).get(1).get(0));
	}

	@When("^User enters ten digit mobile number in correct field$")
	public void user_enters_ten_digit_mobile_number_in_correct_field(DataTable dataTable) throws Throwable {
		toolsQAFormPage = new ToolsQAFormPage(driver);
		toolsQAFormPage.enterMobileNo(dataTable.asLists(String.class).get(1).get(0));
	}

	@When("^User enters his date of birth$")
	public void user_enters_his_date_of_birth(DataTable dataTable) throws Throwable {
		toolsQAFormPage = new ToolsQAFormPage(driver);
		toolsQAFormPage.selectCorrectDOB(dataTable.asLists(String.class).get(1).get(0));
				
	}
	    
	
	@When("^User enters his subject$")
	public void user_enters_his_subject(DataTable dataTable) throws Throwable {
		toolsQAFormPage = new ToolsQAFormPage(driver);
		toolsQAFormPage.enterSubject(dataTable.asLists(String.class).get(1).get(0));
	}

	@When("^User selects his hobby$")
	public void user_selects_his_hobby(DataTable dataTable) throws Throwable {
		toolsQAFormPage = new ToolsQAFormPage(driver);
		toolsQAFormPage.selectHobby(dataTable.asLists(String.class).get(1).get(0));
	}

	@When("^user Uploads his picture$")
	public void user_Uploads_his_picture() throws Throwable {
		toolsQAFormPage = new ToolsQAFormPage(driver);
		toolsQAFormPage.uploadPicture();
	}

	@Then("^user enters his current address$")
	public void user_enters_his_current_address(DataTable dataTable) throws Throwable {
		toolsQAFormPage = new ToolsQAFormPage(driver);
		toolsQAFormPage.enterCurrentAddress(dataTable.asLists(String.class).get(1).get(0));
	}

	@Then("^User selcts his State$")
	public void user_selcts_his_State(DataTable dataTable) throws Throwable {
		toolsQAFormPage = new ToolsQAFormPage(driver);
		toolsQAFormPage.selectState(dataTable.asLists(String.class).get(1).get(0));
	}

	@Then("^User selcts his City$")
	public void user_selcts_his_City(DataTable dataTable) throws Throwable {
		toolsQAFormPage = new ToolsQAFormPage(driver);
		toolsQAFormPage.selectCity(dataTable.asLists(String.class).get(1).get(0));
	}

	@Then("^User Clicks on submit button$")
	public void user_Clicks_on_submit_button() throws Throwable {
		toolsQAFormPage = new ToolsQAFormPage(driver);
		toolsQAFormPage.clickSubmitBtn();
	}

	@Then("^user is shown confirmation message$")
	public void user_is_shown_confirmation_message(DataTable dataTable) throws Throwable {
		toolsQAFormPage = new ToolsQAFormPage(driver);
		toolsQAFormPage.validateConfirmationMsg(dataTable.asLists(String.class).get(1).get(0));
	}

		
			

}
